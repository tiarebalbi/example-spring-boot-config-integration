# Example of integration

## Install

### Maven Dependency:

        <dependency>
            <groupId>com.tiarebalbi.app</groupId>
            <artifactId>examplo-spring-boot-config-integration</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        
### Integration: 

    import br.com.olearys.hemisphere.app.config.AdconAutoConfiguration;
    import org.springframework.context.annotation.Import;
    
    @Import(AdconAutoConfiguration.class)


