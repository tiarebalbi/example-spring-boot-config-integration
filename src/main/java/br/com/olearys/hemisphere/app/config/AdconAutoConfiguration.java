package br.com.olearys.hemisphere.app.config;

import br.com.olearys.hemisphere.business.integration.Adcon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author Tiarê Balbi Bonamini
 */
@Configuration
@EnableAutoConfiguration
@Order(Ordered.HIGHEST_PRECEDENCE)
@EnableConfigurationProperties(AdconProperties.class)
@ComponentScan({"br.com.olearys.hemisphere.business"})
public class AdconAutoConfiguration implements AdconImportSetting {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdconAutoConfiguration.class);

    @Autowired
    private AdconProperties properties;

    private Adcon adcon;

    @Bean
    @ConditionalOnMissingBean
    public Adcon connect() {
        this.adcon = this.properties.createAdconClient();
        return this.adcon;
    }

    public static void main(String[] args) {
        SpringApplication.run(AdconAutoConfiguration.class, args);
    }
}
