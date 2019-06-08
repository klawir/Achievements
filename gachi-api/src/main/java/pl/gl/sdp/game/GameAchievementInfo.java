package pl.gl.sdp.game;

import java.util.List;

public class GameAchievementInfo {
    private String name;
    private List<AchievementInfo> achievementInfos;

    public List<AchievementInfo> getAchievementInfos() {
        return achievementInfos;
    }

    public void setAchievementInfos(List<AchievementInfo> achievementInfos) {
        this.achievementInfos = achievementInfos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
