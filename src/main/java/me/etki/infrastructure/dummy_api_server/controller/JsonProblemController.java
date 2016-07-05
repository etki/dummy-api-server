package me.etki.infrastructure.dummy_api_server.controller;

import me.etki.infrastructure.dummy_api_server.Routing;
import me.etki.infrastructure.dummy_api_server.dto.JsonProblem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@RestController
public class JsonProblemController {

    @RequestMapping(value = Routing.JSON_PROBLEM_ENDPOINT, method = RequestMethod.GET)
    public ResponseEntity<JsonProblem> getProblem(@PathVariable int statusCode) {
        JsonProblem problem = new JsonProblem()
                .setType("https://localhost/doc/error/manually-invoked-error")
                .setTitle("Error title")
                .setStatus(statusCode)
                .setDetail("Manually-triggered error with status code " + statusCode)
                .setInstance("https://localhost/trace/error/" + UUID.randomUUID())
                .addExtension("balance", 0);
        return new ResponseEntity<>(problem, HttpStatus.valueOf(statusCode));
    }
}
