package me.etki.infrastructure.dummy_api_server.controller;

import me.etki.infrastructure.dummy_api_server.Routing;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
@RestController
public class IncomingPayloadController {

    @RequestMapping(Routing.PAYLOAD_MIRROR_ENDPOINT)
    public ResponseEntity<Object> mirror(@RequestBody Object payload) {
        return new ResponseEntity<>(payload, HttpStatus.OK);
    }
}
