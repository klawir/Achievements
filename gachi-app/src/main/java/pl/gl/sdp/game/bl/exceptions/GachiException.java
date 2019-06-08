package pl.gl.sdp.game.bl.exceptions;

public class GachiException extends RuntimeException{
    public GachiException() {
    }

    public GachiException(String message) {
        super(message);
    }

    public GachiException(String message, Throwable cause) {
        super(message, cause);
    }

    public GachiException(Throwable cause) {
        super(cause);
    }
}
