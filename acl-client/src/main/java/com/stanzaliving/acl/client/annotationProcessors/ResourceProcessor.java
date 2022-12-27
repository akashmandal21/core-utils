package com.stanzaliving.acl.client.annotationProcessors;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.*;
import com.stanzaliving.acl.client.AttributeDto;
import com.stanzaliving.acl.client.annotation.Attribute;
import com.stanzaliving.acl.client.annotation.Resource;
import org.springframework.util.StringUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SupportedAnnotationTypes("com.stanzaliving.acl.client.annotation.Resource")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class ResourceProcessor extends AbstractProcessor {

    private Types typeUtils;
    private Elements elementUtils;
    private Filer filer;
    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        typeUtils = processingEnv.getTypeUtils();
        elementUtils = processingEnv.getElementUtils();
        filer = processingEnv.getFiler();
        messager = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                if (annotation.getSimpleName().toString().equals("Resource")) {
                    Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
                    HashMap<String, ArrayList<String>> resourceAttributeMap = new HashMap<>();
                    HashMap<String, ArrayList<String>> resourcePermissionMap = new HashMap<>();
                    HashMap<String, TypeSpec.Builder> resourceBuilderMap = new HashMap<>();

                    for (Element annotatedElement : annotatedElements) {

                        String key = annotatedElement.getAnnotation(Resource.class).name();
                        if (resourceBuilderMap.get(key) == null) {
                            resourceBuilderMap.put(key, TypeSpec.classBuilder(StringUtils.capitalize(key) + "AttributeDto")
                                    .addModifiers(Modifier.PUBLIC)
                                    .superclass(AttributeDto.class));
                        }

                        if (resourceAttributeMap.get(key) == null) {
                            resourceAttributeMap.put(key, new ArrayList<>());
                            resourcePermissionMap.put(key, new ArrayList<>());
                        }

                        String[] permissions = annotatedElement.getAnnotation(Resource.class).permissions();
                        Pattern p = Pattern.compile(
                                "[^a-z0-9]", Pattern.CASE_INSENSITIVE);

                        for (int i = 0; i < permissions.length; i++) {
                            Matcher m=p.matcher(permissions[i]);
                            System.out.println(permissions[i]);
                            if(m.find()){
                                throw new IllegalArgumentException("The permission should not contain special characters");
                            }
                            permissions[i] =key+" "+permissions[i];
                        }
                        resourcePermissionMap.get(key).addAll(Arrays.asList(permissions));

                        List<? extends Element> enclosedElements = annotatedElement.getEnclosedElements();

                        for (Element enclosedElement : enclosedElements) {
                            if (enclosedElement.getAnnotation(Attribute.class) != null) {
                                try {
                                    resourceBuilderMap.put(key, addFieldAndGetterAndSetter(resourceBuilderMap.get(key), enclosedElement.getSimpleName().toString(), enclosedElement.asType()));
                                } catch (ClassNotFoundException e) {
                                    messager.printMessage(Diagnostic.Kind.ERROR,e.getMessage());
                                }
                                resourceAttributeMap.get(key).add(enclosedElement.getSimpleName().toString() + "|" + enclosedElement.getAnnotation(Attribute.class).type().toString());
                            }
                        }
                    }
                    processPermission(resourcePermissionMap);

                    try {
                        generateClassForAttributes(resourceBuilderMap);
                        generateClassForResourceAttributeAndPermission(resourceAttributeMap, resourcePermissionMap);
                    } catch (IOException e) {
                        messager.printMessage(Diagnostic.Kind.ERROR,e.getMessage());
                    }
                }
            }
            return true;
        }
        catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    private void generateClassForAttributes(HashMap<String,TypeSpec.Builder> resourceBuilderMap) throws IOException {
        for(TypeSpec.Builder attributeDtoBuilder: resourceBuilderMap.values()) {
            generateFile(attributeDtoBuilder);
        }
    }

    public void generateClassForResourceAttributeAndPermission(HashMap<String,ArrayList<String>> resourceAttributeMap,
                                                               HashMap<String,ArrayList<String>> resourcePermissionMap) throws IOException {

        String temp1="resourceAttributeMap = java.util.stream.Stream.of(\n";

        temp1=createMapField(temp1,resourceAttributeMap);

        FieldSpec rsmap=FieldSpec.builder(Map.class,"resourceAttributeMap")
                .addModifiers(Modifier.PUBLIC)
                .addModifiers(Modifier.STATIC)
                .build();

        String temp2="resourcePermissionMap = java.util.stream.Stream.of(\n";

        temp2=createMapField(temp2,resourcePermissionMap);

        FieldSpec rpmap=FieldSpec.builder(Map.class,"resourcePermissionMap")
                .addModifiers(Modifier.PUBLIC)
                .addModifiers(Modifier.STATIC)
                .build();

        TypeSpec.Builder person = TypeSpec
                .classBuilder("AbacResources")
                .addModifiers(Modifier.PUBLIC)
                .addField(rsmap)
                .addField(rpmap)
                .addStaticBlock(CodeBlock.builder()
                        .addStatement(temp1)
                        .addStatement(temp2)
                        .build());

        generateFile(person);
    }

    public String createMapField(String temp,HashMap<String,ArrayList<String>> resourceAttributeMap){
        Iterator<String> itr=resourceAttributeMap.keySet().iterator();
        while(itr.hasNext()){
            String key= itr.next();
            List<String> value=resourceAttributeMap.get(key);
            String evolValue="";
            Iterator<String> vitr=value.iterator();
            while(vitr.hasNext()){
                evolValue=evolValue+"\""+vitr.next()+"\"";
                if(vitr.hasNext()){
                    evolValue=evolValue+",";
                }
            }
            evolValue="java.util.Arrays.asList("+ evolValue +")";
            if(!itr.hasNext()){
                temp=temp+"  new java.util.AbstractMap.SimpleEntry<String, java.util.List<String>>(\""+key+"\","+evolValue+")\n" +
                        ").collect(java.util.stream.Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))";
            }
            else{
                temp=temp+"  new java.util.AbstractMap.SimpleEntry<String, java.util.List<String>>(\""+key+"\","+evolValue+"),\n";
            }
        }
        return temp;
    }

    public void processPermission(HashMap<String, ArrayList<String>> resourcePermissionMap){

        TypeSpec.Builder typeSpecBuilder=TypeSpec.classBuilder("Permissions").addModifiers(Modifier.PUBLIC);
        for (Map.Entry<String, ArrayList<String>> entry : resourcePermissionMap.entrySet()) {
            String[] permissions = entry.getValue().toArray(new String[entry.getValue().size()]);
            int n = permissions.length;
            for (int i = 0; i < n; i++) {
                typeSpecBuilder.addField(FieldSpec.builder(String.class,String.join("_",permissions[i].split(" ")))
                                .addModifiers(Modifier.STATIC,Modifier.PUBLIC,Modifier.FINAL)
                                .initializer("\""+permissions[i]+"\"")
                        .build());
            }
        }
        try {
            generateFile(typeSpecBuilder);
        } catch (IOException e) {
            messager.printMessage(Diagnostic.Kind.ERROR, e.getMessage());
        }
    }

    public void generateFile(TypeSpec.Builder typespecBuilder) throws IOException {

        JavaFile javaFile = JavaFile.builder("com.stanzaliving.acl.client",
                        typespecBuilder.build())
                .indent("    ")
                .build();

        javaFile.writeTo(filer);
    }

    public TypeSpec.Builder addFieldAndGetterAndSetter(TypeSpec.Builder attributeDtoBuilder, String fieldName, TypeMirror fieldType) throws ClassNotFoundException {
        FieldSpec fieldSpec=FieldSpec.builder(TypeName.get(fieldType),fieldName)
                .addModifiers(Modifier.PUBLIC)
                .build();

        return attributeDtoBuilder.addField(fieldSpec)
                .addMethod(MethodSpec
                        .methodBuilder("get"+ StringUtils.capitalize(fieldName))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(TypeName.get(fieldType))
                        .addStatement("return this."+fieldName)
                        .build())
                .addMethod(MethodSpec
                        .methodBuilder("set"+StringUtils.capitalize(fieldName))
                        .addParameter(TypeName.get(fieldType), fieldName)
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("this."+fieldName+" = "+fieldName)
                        .build());

    }

}
