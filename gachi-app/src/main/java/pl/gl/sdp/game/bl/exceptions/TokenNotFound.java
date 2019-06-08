package pl.gl.sdp.game.bl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Brak tokena")
public class TokenNotFound extends GachiException {
}
