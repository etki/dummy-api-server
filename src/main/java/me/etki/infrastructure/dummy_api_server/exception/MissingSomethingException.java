package me.etki.infrastructure.dummy_api_server.exception;

/**
 * Actually i've missed ResourceNotFoundException which is in other spring package
 *
 * @author Etki {@literal <etki@etki.name>}
 * @version %I%, %G%
 * @since 0.1.0
 */
public class MissingSomethingException extends Exception {

    public MissingSomethingException() {
    }

    public MissingSomethingException(String message) {
        super(message);
    }

    public MissingSomethingException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingSomethingException(Throwable cause) {
        super(cause);
    }

    public MissingSomethingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
