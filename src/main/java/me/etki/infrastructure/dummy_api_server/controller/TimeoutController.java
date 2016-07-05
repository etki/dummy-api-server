package me.etki.infrastructure.dummy_api_server.controller;

import me.etki.infrastructure.dummy_api_server.Routing;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@RestController
public class TimeoutController {

    @RequestMapping(value = Routing.TIMEOUT_ENDPOINT, method = RequestMethod.GET)
    public Void getSleepy(@PathVariable long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
        return null;
    }
}
