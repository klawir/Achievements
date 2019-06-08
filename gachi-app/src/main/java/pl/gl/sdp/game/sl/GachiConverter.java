package pl.gl.sdp.game.sl;

import org.springframework.stereotype.Component;
import pl.gl.sdp.game.GameAchievementInfo;
import pl.gl.sdp.game.GameToken;
import pl.gl.sdp.game.bl.GameInfo;

@Component
public class GachiConverter {
    public GameAchievementInfo convert(GameInfo gameInfo) {
        GameAchievementInfo result = new GameAchievementInfo();
        result.setName(gameInfo.getName());
        return result;
    }

    public GameToken convertToGameToken(String token) {
        GameToken gameToken = new GameToken();
        gameToken.setToken(token);
        return gameToken;
    }
}
