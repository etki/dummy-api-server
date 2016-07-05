package me.etki.infrastructure.dummy_api_server.controller.advice;

import me.etki.infrastructure.dummy_api_server.dto.JsonProblem;
import me.etki.infrastructure.dummy_api_server.exception.MissingSomethingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@ControllerAdvice
public class MissingSomethingExceptionHandler {

    @ExceptionHandler(MissingSomethingException.class)
    public ResponseEntity<JsonProblem> handleException(MissingSomethingException exception) {
        JsonProblem problem = new JsonProblem()
                .setStatus(404)
                .setTitle("Failed to find entity")
                .setDetail(exception.getMessage());
        return new ResponseEntity<>(problem, HttpStatus.NOT_FOUND);
    }
}
