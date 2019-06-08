package pl.gl.sdp.game.dl;


import javax.persistence.*;

@Entity
public class Achievement {
    @Id
    @GeneratedValue
    private Long id;

    private String token;

    @GeneratedValue
    @Column(nullable = false)
    private String name;

    private String description;

    public Achievement(String name) {

        this.name = name;
    }

    @ManyToOne
    private Game game;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
