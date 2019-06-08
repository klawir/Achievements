package pl.gl.sdp.game.dl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Manager {
    private List<Achievement> achievementList;

    public List<Achievement> getAchievementList() {
        return achievementList;
    }

    public  Manager()
    {
        achievementList= new ArrayList<Achievement>();
    }
    public void add(Achievement name)
    {
        achievementList.add(name);
    }
}
