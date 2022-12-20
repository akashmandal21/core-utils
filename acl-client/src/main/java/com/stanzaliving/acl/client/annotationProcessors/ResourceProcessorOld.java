package com.stanzaliving.acl.client.annotationProcessors;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.*;
import com.stanzaliving.acl.client.annotation.Attribute;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@SupportedAnnotationTypes({"com.stanzaliving.acl.client.annotation.Resource","com.stanzaliving.acl.client.annotation.Attribute"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class ResourceProcessorOld extends AbstractProcessor {

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

        String attributeName;
        TypeMirror attributeType;

        String nameOfResource="";
        HashMap<String, ArrayList<String>> resourceAttributeMap=new HashMap<>();
        for(TypeElement annotation:annotations) {
            resourceAttributeMap.put("value1",new ArrayList<>());
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"mapping "+resourceAttributeMap.toString());
            Set<? extends Element> annotatedElements=roundEnv.getElementsAnnotatedWith(annotation);
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,annotation.asType().toString());
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"line 50 "+annotation.getEnclosingElement());
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,""+annotation.asType().toString().contains("Resource"));
            if(annotation.asType().toString().contains("Resource")) {
                resourceAttributeMap.put(String.valueOf(annotation.getSimpleName()),new ArrayList<String>());
                //processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,resourceAttributeMap.toString());
            }

            if(annotation.asType().toString().contains("Attribute")){
                VariableElement attributeElement = (VariableElement) annotation.getAnnotation(Attribute.class);
                //processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"line 64 "+attributeElement.getSimpleName());
                //processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"line 65 "+resourceAttributeMap);


            }


            else
            {
                String packageName = null;
                TypeSpec.Builder typeSpecBuilder = null;

                try {
                    typeSpecBuilder = createAttributesEnum();

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                for (Element annotatedElement : roundEnv.getElementsAnnotatedWith(Attribute.class)) {
                    VariableElement attributeElement = (VariableElement) annotatedElement;

                    attributeName = String.valueOf(attributeElement.getSimpleName());
                    attributeType = attributeElement.asType();
                    String className = ((TypeElement) attributeElement.getEnclosingElement()).getQualifiedName().toString();
                    typeSpecBuilder.addEnumConstant(attributeName, TypeSpec.anonymousClassBuilder(attributeType.toString() + ".class").build());

                    int lastDot = className.lastIndexOf('.');
                    if (lastDot > 0) {
                        packageName = className.substring(0, lastDot);
                    }
                }

                try {
                    generateCode(typeSpecBuilder);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }
    private void error(Element e, String msg, Object... args) {
        messager.printMessage(
                Diagnostic.Kind.ERROR,
                String.format(msg, args),
                e);
    }


    public TypeSpec.Builder createAttributesEnum() throws IOException, ClassNotFoundException {

        TypeSpec.Builder typespecBuilder = TypeSpec.enumBuilder("AttributeType")
                .addModifiers(Modifier.PUBLIC)
                .addField(Class.class, "typeClass", Modifier.PUBLIC)
                .addMethod(MethodSpec.constructorBuilder()
                        .addParameter(Class.class, "typeClass")
                        .addStatement("this.$N = $N", "typeClass", "typeClass")
                        .build());

        typespecBuilder.addEnumConstant("DEFAULT", TypeSpec.anonymousClassBuilder("Object.class").build());

        return typespecBuilder;
    }

    public void generateCode(TypeSpec.Builder typespecBuilder) throws IOException {

        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"came inside generate code only once");
        JavaFile javaFile = JavaFile.builder("com.stanzaliving.acl.client",
                        typespecBuilder.build())
                .indent("    ")
                .build();
        javaFile.writeTo(filer);
        //processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, javaFile.toString());
    }

    public TypeSpec.Builder addEnum(TypeSpec.Builder typespecBuilder, String attributeName, TypeMirror attributeType){

        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"The present attribute name is "+attributeName);

        return typespecBuilder.addEnumConstant(attributeName, TypeSpec.anonymousClassBuilder(attributeType.toString()+".class").build());

    }


}
