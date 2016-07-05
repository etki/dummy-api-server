package me.etki.infrastructure.dummy_api_server.controller;

import me.etki.infrastructure.dummy_api_server.Routing;
import me.etki.infrastructure.dummy_api_server.dto.MethodContainer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@RestController
public class MethodSupportingController {

    @RequestMapping(Routing.METHOD_ENDPOINT)
    public MethodContainer getMethod(HttpServletRequest request) {
        if (request.getMethod().equals("HEAD")) {
            return null;
        }
        return new MethodContainer(request.getMethod());
    }
}
