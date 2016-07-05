package me.etki.infrastructure.dummy_api_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@SpringBootApplication
public class EntryPoint {

    public static void main(String[] args) {
        SpringApplication.run(EntryPoint.class, args);
    }
}
