package pl.gl.sdp.game.dl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResControler {

    @Autowired
    private Manager manager;

    @GetMapping("/results")
    public List<Achievement> achievementList() {
        return manager.getAchievementList();
    }
}
