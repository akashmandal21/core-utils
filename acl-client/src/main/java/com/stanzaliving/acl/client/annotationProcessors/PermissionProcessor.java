package com.stanzaliving.acl.client.annotationProcessors;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.stanzaliving.acl.client.annotation.Permission;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;


@SupportedAnnotationTypes("com.stanzaliving.acl.client.annotation.Permission")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class PermissionProcessor extends AbstractProcessor {

    private Types typeUtils;
    private Elements elementUtils;
    private Filer filer;
    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"inside permission processor");
        System.out.println("inside permisison processor");
        super.init(processingEnv);
        typeUtils = processingEnv.getTypeUtils();
        elementUtils = processingEnv.getElementUtils();
        filer = processingEnv.getFiler();
        messager = processingEnv.getMessager();
    }


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//        for(TypeElement annotation:annotations){
//            Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
//            TypeSpec.Builder typeSpecBuilder = createPermissionsEnum();
//            for(Element element:annotatedElements){
//                Permission permission=element.getAnnotation(Permission.class);
//                String[] values=permission.permissions();
//                int n=values.length;
//                for(int i=0;i<n;i++){
//                    typeSpecBuilder.addEnumConstant(values[i]);
//                }
//            }
//            try {
//                generatePermissionEnumFile(typeSpecBuilder);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        return false;
    }

    public void generatePermissionEnumFile(TypeSpec.Builder typespecBuilder) throws IOException {

        JavaFile javaFile = JavaFile.builder("com.stanzaliving.acl.client",
                        typespecBuilder.build())
                .indent("    ")
                .build();

        Path path= Paths.get("/Users/kedimetla.pavan/Documents/ACL/part-1-maven/acl-client/src/main/java");
        javaFile.writeTo(filer);
    }

    public TypeSpec.Builder createPermissionsEnum(){

        TypeSpec.Builder typespecBuilder = TypeSpec.enumBuilder("Permissions")
                .addModifiers(Modifier.PUBLIC);
        return typespecBuilder;
    }
}
