package app.family;

import java.security.PublicKey;

public class Human {
    private String speak;
    private int height;
    private int weight;
    private String rankInTheFamily;
    private boolean sleep;
    private boolean walk;
    private boolean eat;

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public void setRankInTheFamily(String rankInTheFamily) {
        this.rankInTheFamily = rankInTheFamily;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
