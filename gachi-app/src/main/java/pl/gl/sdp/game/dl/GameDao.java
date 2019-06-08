package pl.gl.sdp.game.dl;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GameDao extends CrudRepository<Game, Long> {
    Optional<Game> findByToken(String token);
}
