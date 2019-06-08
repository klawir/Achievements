package pl.gl.sdp.game.bl;

import pl.gl.sdp.game.GameToken;

public interface GameService {
    GameInfo getGameInfo(String token);

    String createGame(String name, String version);
}
