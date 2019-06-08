package pl.gl.sdp.game.dl;


import javax.persistence.*;
import java.util.List;

@Entity
public class Game {
    @Id
    @GeneratedValue
    private Long id;

    private String token;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String version;

    @OneToMany
    private List<Achievement> achievements;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }
}
