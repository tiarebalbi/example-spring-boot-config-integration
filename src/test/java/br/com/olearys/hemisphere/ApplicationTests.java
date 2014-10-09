package br.com.olearys.hemisphere;

import br.com.olearys.hemisphere.app.config.AdconAutoConfiguration;
import br.com.olearys.hemisphere.business.integration.Adcon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AdconAutoConfiguration.class)
public class ApplicationTests {

    @Autowired
    private Adcon adcon;

    @Test
    public void contextLoads() {

        try {
            String token = this.adcon.connect();
            assertEquals("333", token);
            // TODO Implementar lógica de consulta

        } finally {
            this.adcon.disconnect();
        }

        assertNull(this.adcon.getToken());
    }


}
