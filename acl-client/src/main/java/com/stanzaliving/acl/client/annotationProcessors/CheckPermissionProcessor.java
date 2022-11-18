package com.stanzaliving.acl.client.annotationProcessors;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;


@SupportedAnnotationTypes("com.stanzaliving.acl.client.annotation.CheckPermission")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class CheckPermissionProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for(TypeElement typeElement:annotations){
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"print while hitting api");
        }
        return false;
    }
}
