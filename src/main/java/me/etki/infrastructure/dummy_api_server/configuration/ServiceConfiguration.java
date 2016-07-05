package me.etki.infrastructure.dummy_api_server.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@EnableWebMvc
@ComponentScan("me.etki.infrastructure")
public class ServiceConfiguration {

}
