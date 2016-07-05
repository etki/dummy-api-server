package me.etki.infrastructure.dummy_api_server.controller;

import me.etki.infrastructure.dummy_api_server.Routing;
import me.etki.infrastructure.dummy_api_server.dto.User;
import me.etki.infrastructure.dummy_api_server.exception.MissingSomethingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@RestController
public class ArbitraryPayloadController {

    private static final User USER_A = new User()
            .setId(UUID.randomUUID())
            .setLogin("fike");

    private static final User USER_B = new User()
            .setId(UUID.randomUUID())
            .setLogin("etki");

    private static final List<User> USER_LIST = Arrays.asList(USER_A, USER_B);
    private static final Map<String, User> USER_MAP = new HashMap<String, User>() {{
        for (User user : USER_LIST) {
            put(user.getLogin(), user);
        }
    }};

    @RequestMapping(value = Routing.USER_ENDPOINT, method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable String login) throws MissingSomethingException {
        User user = USER_MAP.get(login);
        if (user == null) {
            throw new MissingSomethingException("User " + login + " hasn't been found");
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = Routing.USERS_ENDPOINT, method = RequestMethod.GET)
    public List<User> getUsers() {
        return USER_LIST;
    }
}
