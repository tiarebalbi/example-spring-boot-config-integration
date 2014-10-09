package br.com.olearys.hemisphere.app.annotation;

import br.com.olearys.hemisphere.app.config.AdconAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Annotation to enable adcon integration via annotation configuration.
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AdconAutoConfiguration.class)
public @interface EnableAdconConfiguration {
}
