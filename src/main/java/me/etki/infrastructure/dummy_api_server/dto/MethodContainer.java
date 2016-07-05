package me.etki.infrastructure.dummy_api_server.dto;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
public class MethodContainer {

    private final String method;

    public MethodContainer(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
