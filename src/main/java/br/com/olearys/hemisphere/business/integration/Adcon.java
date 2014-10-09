package br.com.olearys.hemisphere.business.integration;

import org.springframework.util.Assert;

/**
 * @author Tiarê Balbi Bonamini
 */
public class Adcon {

    private static final String FULL_VERSION = "1.3.0";

    private final String host;

    private final String password;

    private final String username;

    private String token;

    public Adcon(String username, String password, String host) {
        this.username = username;
        this.password = password;
        this.host = host;
    }

    /**
     * @return String FULL_VERSION
     */
    public String getVersion() {
         return FULL_VERSION;
    }

    public String connect() {
        this.token = "333"; // Test value
        return this.token;
    }

    public void disconnect() {

        // Test logic
        Assert.notNull(this.token, "Não foi possível identificar o token para desconectar a sessão.");
        this.disconnect(this.token);
    }

    private void disconnect(String token) {
        this.token = null;
    }

    public String getToken() {
        return token;
    }
}
