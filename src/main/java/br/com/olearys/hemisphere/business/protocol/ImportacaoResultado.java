package br.com.olearys.hemisphere.business.protocol;

import br.com.olearys.hemisphere.business.integration.Adcon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Integration Example
 */
@Component
public class ImportacaoResultado {

    @Autowired
    private Adcon adconClient;


    public void exemplo () {

        try{
            String token = this.adconClient.connect();

            // TODO Impl...

        }finally {
            this.adconClient.disconnect();
        }
    }

}
