package me.etki.infrastructure.dummy_api_server;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
public class Routing {

    public static final String METHOD_ENDPOINT = "/http/method";

    public static final String TIMEOUT_ENDPOINT = "/api/timeout/{milliseconds}";

    public static final String NULL_ENDPOINT = "/api/null";

    public static final String JSON_PROBLEM_ENDPOINT = "/api/error/{statusCode}";

    public static final String USERS_ENDPOINT = "/api/structure/user";

    public static final String USER_ENDPOINT = USERS_ENDPOINT + "/{login}";

    public static final String PAYLOAD_MIRROR_ENDPOINT = "/api/payload/mirror";
}
