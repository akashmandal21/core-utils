package com.stanzaliving.acl.client.annotationProcessors;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.*;
import com.stanzaliving.acl.client.AttributeDto;
import com.stanzaliving.acl.client.Permissions;
import com.stanzaliving.acl.client.Utils.AttributeValueProvider;
import com.stanzaliving.acl.client.annotation.Attribute;
import com.stanzaliving.acl.client.annotation.Permission;
import com.stanzaliving.acl.client.annotation.Resource;
import org.springframework.util.StringUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"inside resource processor init");
        System.out.println("inside resource processor");
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
                System.out.println("inside resource processor");
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Annotations is "+annotation.getSimpleName());
                if (annotation.getSimpleName().toString().equals("Resource")) {
                    Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
                    HashMap<String, ArrayList<String>> resourceAttributeMap = new HashMap<>();
                    HashMap<String, ArrayList<String>> resourcePermissionMap = new HashMap<>();
                    HashMap<String, TypeSpec.Builder> resourceBuilderMap = new HashMap<>();
//                HashMap<String,Class<? extends AttributeValueProvider>> permissionAttribiuteProviderMap= new HashMap<>();

                    for (Element annotatedElement : annotatedElements) {

                        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "line 56 " + annotatedElement.getSimpleName());
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
//                    Class<? extends AttributeValueProvider> className=annotatedElement.getAnnotation(Resource.class).attributeValueProvider();
                        for (int i = 0; i < permissions.length; i++) {
                            permissions[i] =key+" "+permissions[i];
//                        permissionAttribiuteProviderMap.put(permissions[i],className);
                        }
                        resourcePermissionMap.get(key).addAll(Arrays.asList(permissions));

                        List<? extends Element> enclosedElements = annotatedElement.getEnclosedElements();

                        for (Element enclosedElement : enclosedElements) {
                            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "The enclosed element is:" + enclosedElement.getSimpleName());
                            if (enclosedElement.getAnnotation(Attribute.class) != null) {
//                            VariableElement variableElement= (VariableElement) enclosedElement;
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
                    } catch (IOException e) {
                        messager.printMessage(Diagnostic.Kind.ERROR,e.getMessage());
                    }


                    processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "line 44 " + resourceAttributeMap.toString());
                    try {
                        generateClassForResourceAttributeAndPermission(resourceAttributeMap, resourcePermissionMap);
                    } catch (IOException e) {
                        messager.printMessage(Diagnostic.Kind.ERROR,e.getMessage());
                    }
                }
            }
            System.out.println("At the end of resource processor");
            return false;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            messager.printMessage(Diagnostic.Kind.ERROR,e.getMessage());
        }
        return false;
    }

    private void generateClassForAttributes(HashMap<String,TypeSpec.Builder> resourceBuilderMap) throws IOException {
        for(TypeSpec.Builder attributeDtoBuilder: resourceBuilderMap.values()) {
            JavaFile javaFile = JavaFile.builder("com.stanzaliving.acl.client",
                            attributeDtoBuilder.build())
                    .indent("    ")
                    .build();
            Path path = Paths.get("/Users/kedimetla.pavan/Documents/ACL/part-1-maven/acl-client/src/main/java");
            javaFile.writeTo(filer);
        }
//        javaFile.writeTo(path);
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

//        String temp3="permissionAttribiuteProviderMap = java.util.stream.Stream.of(\n";
//
//        temp3=createMapField2(temp3,papm);
//
//        FieldSpec papmap=FieldSpec.builder(Map.class,"permissionAttribiuteProviderMap")
//                .addModifiers(Modifier.PUBLIC)
//                .addModifiers(Modifier.STATIC)
//                .build();

        TypeSpec person = TypeSpec
                .classBuilder("AbacResources")
                .addModifiers(Modifier.PUBLIC)
                .addField(rsmap)
                .addField(rpmap)
                .addStaticBlock(CodeBlock.builder()
                        .addStatement(temp1)
                        .addStatement(temp2)
//                        .addStatement(temp3)
                        .build())
                .build();


        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"came inside generate code only once");
        JavaFile javaFile = JavaFile.builder("com.stanzaliving.acl.client",
                        person)
                .indent("    ")
                .build();
        Path path= Paths.get("/Users/kedimetla.pavan/Documents/ACL/part-1-maven/acl-client/src/main/java");
        javaFile.writeTo(filer);
//        javaFile.writeTo(path);
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


    public String createMapField2(String temp,HashMap<String,Class<? extends AttributeValueProvider>> permissionProviderMap){
        Iterator<String> itr=permissionProviderMap.keySet().iterator();
        while(itr.hasNext()){
            String key= itr.next();
            Class<? extends AttributeValueProvider> value=permissionProviderMap.get(key);

            if(!itr.hasNext()){
                temp=temp+"  new java.util.AbstractMap.SimpleEntry<String, Class<?>>(\""+key+"\","+value+")\n" +
                        ").collect(java.util.stream.Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))";
            }
            else{
                temp=temp+"  new java.util.AbstractMap.SimpleEntry<String, Class<?>>(\""+key+"\","+value+"),\n";
            }
        }
        return temp;
    }


    public void processPermission(HashMap<String, ArrayList<String>> resourcePermissionMap){
        for(String resource:resourcePermissionMap.keySet()) {
            TypeSpec.Builder typeSpecBuilder = createPermissionsEnum(resource);
            TypeSpec.Builder typeSpecBuilder2=TypeSpec.classBuilder("constants").addModifiers(Modifier.PUBLIC);
            for (Map.Entry<String, ArrayList<String>> entry : resourcePermissionMap.entrySet()) {
                String[] permissions = entry.getValue().toArray(new String[entry.getValue().size()]);
                int n = permissions.length;
                for (int i = 0; i < n; i++) {
                    typeSpecBuilder.addEnumConstant(permissions[i]);
                    typeSpecBuilder2.addField(FieldSpec.builder(String.class,permissions[i])
                                    .addModifiers(Modifier.STATIC,Modifier.PUBLIC,Modifier.FINAL)
                                    .initializer("\""+permissions[i]+"\"")
                            .build());
                }
            }
            try {
                generatePermissionEnumFile(typeSpecBuilder);
                JavaFile javaFile = JavaFile.builder("com.stanzaliving.acl.client",
                                typeSpecBuilder2.build())
                        .indent("    ")
                        .build();

                Path path= Paths.get("/Users/kedimetla.pavan/Documents/ACL/part-1-maven/acl-client/src/main/java");
//        javaFile.writeTo(filer);
                javaFile.writeTo(filer);

            } catch (IOException e) {
                messager.printMessage(Diagnostic.Kind.ERROR, e.getMessage());
            }
        }
    }

    public TypeSpec.Builder createPermissionsEnum(String resource){

        TypeSpec.Builder typespecBuilder = TypeSpec.enumBuilder(resource+"_permissions")
                .addModifiers(Modifier.PUBLIC);
        return typespecBuilder;
    }

    public void generatePermissionEnumFile(TypeSpec.Builder typespecBuilder) throws IOException {

//        typespecBuilder.addSuperinterface(Permissions.class);
        JavaFile javaFile = JavaFile.builder("com.stanzaliving.acl.client",
                        typespecBuilder.build())
                .indent("    ")
                .build();

        Path path= Paths.get("/Users/kedimetla.pavan/Documents/ACL/part-1-maven/acl-client/src/main/java");
//        javaFile.writeTo(filer);
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
