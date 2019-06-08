package pl.gl.sdp.game;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Gachi {

    @RequestMapping(
            path = "/games/{token}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    GameAchievementInfo getGameInfo(@PathVariable("token") String gameToken);


    @RequestMapping(
            path = "/game",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    GameToken createGame(@RequestBody CreateGameRequest createGameRequest);
}
