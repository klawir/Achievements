package pl.gl.sdp.game.sl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gl.sdp.game.CreateGameRequest;
import pl.gl.sdp.game.Gachi;
import pl.gl.sdp.game.GameAchievementInfo;
import pl.gl.sdp.game.GameToken;
import pl.gl.sdp.game.bl.GameInfo;
import pl.gl.sdp.game.bl.GameService;
import pl.gl.sdp.game.bl.exceptions.BadParameter;
import pl.gl.sdp.game.dl.Achievement;
import pl.gl.sdp.game.dl.Game;

import java.util.List;

@RestController
public class GachiEndpoint implements Gachi {

    @Autowired
    GameService gameService;

    @Autowired
    GachiConverter gachiConverter;

    @Override
    public GameAchievementInfo getGameInfo(String gameToken) {
        final GameInfo gameInfo = gameService.getGameInfo(gameToken);
        return  gachiConverter.convert(gameInfo);
    }

    @Override
    public GameToken createGame(CreateGameRequest createGameRequest) {
        return gachiConverter.convertToGameToken(gameService.createGame(createGameRequest.getName(), createGameRequest.getVersion()));
    }

    @ExceptionHandler(BadParameter.class)
    public ResponseEntity<String> handleBadParameter(BadParameter badParameter) {
        String message = "Wrong value of parameter " + badParameter.getParameterName();
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

}
