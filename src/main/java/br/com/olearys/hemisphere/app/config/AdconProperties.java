package br.com.olearys.hemisphere.app.config;

import br.com.olearys.hemisphere.business.integration.Adcon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.Assert;

/**
 * @author Tiarê Balbi Bonamini
 */
@ConfigurationProperties(prefix = "hemisphere.ws.adcon")
public class AdconProperties {

    private String username;

    private String password;

    private String host;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Adcon createAdconClient() {

        Assert.notNull(this.username, "Não foi possível identificar o usuário de conexão ao servidor da adcon");
        Assert.notNull(this.password, "Não foi possível identificar a senha de conexão ao servidor da adcon");
        Assert.notNull(this.host, "Não foi possível identificar o endereço de conexão ao servidor da adcon");

        Adcon adcon = new Adcon(this.username,this.password, this.host);
        return adcon;
    }
}
