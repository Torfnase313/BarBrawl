package assets.actors;

import assets.GameAsset;
import java.awt.Image;

public class Player extends GameAsset {

    String name;
    
    public Player(int x, int y, Image img, String name) {
        super(x, y, img, name);
        this.name = "Player 1";
    }

    public void walk(int x, int y) {

    }

    public void run(int x, int y) {

    }

    public void sneak(int x, int y) {

    }

    public boolean fight(Enemy e) {
        return true;
    }
    
}
