# Módulo para integração ao web service ADCON

## Instalação

### Maven Dependency:

        <dependency>
            <groupId>br.com.olearys.hemisphere</groupId>
            <artifactId>hemisphere-ws-adcon</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        
### Inicialiação do Módulo: 

    import br.com.olearys.hemisphere.app.config.AdconAutoConfiguration;
    import org.springframework.context.annotation.Import;
    
    @Import(AdconAutoConfiguration.class)


