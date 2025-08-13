package com.aaslin.spring.valuedemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServerConfig {

    @Value("${server.host}")
    private String host;

    @Value("${server.port}")
    private int port;

    @Value("${server.username}")
    private String username;

    @Value("${server.password}")
    private String password;

    public void printConfig() {
        System.out.println("Server Host: " + host);
        System.out.println("Server Port: " + port);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
