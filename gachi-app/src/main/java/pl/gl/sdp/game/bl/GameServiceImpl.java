package pl.gl.sdp.game.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import pl.gl.sdp.game.bl.exceptions.BadParameter;
import pl.gl.sdp.game.bl.exceptions.TokenNotFound;
import pl.gl.sdp.game.dl.Achievement;
import pl.gl.sdp.game.dl.Game;
import pl.gl.sdp.game.dl.GameDao;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameDao gameDao;

    @Autowired
    TokenGnerator tokenGnerator;

    @Override
    public GameInfo getGameInfo(String token) {
        final Optional<Game> game = gameDao.findByToken(token);
        if (game.isPresent()) {
            GameInfo gameInfo = new GameInfo();
            gameInfo.setName(game.get().getName());
            return gameInfo;
        } else {
            throw new TokenNotFound();
        }
    }

    @Override
    public String createGame(String name, String version) {
        if (name == null || name.trim().isEmpty() ) {
            throw new BadParameter("name");
        }
        if (version == null || version.trim().isEmpty() ) {
            throw new BadParameter("version");
        }
        Game game = new Game();
        game.setName(name);
        game.setVersion(version);
        game.setToken(tokenGnerator.getToken());
        game = gameDao.save(game);
        return game.getToken();
    }
}
