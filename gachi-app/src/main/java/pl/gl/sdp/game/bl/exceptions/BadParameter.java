package pl.gl.sdp.game.bl.exceptions;

public class BadParameter extends GachiException {
    private final String parameterName;

    public BadParameter(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterName() {
        return parameterName;
    }
}
