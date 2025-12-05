
package assets.actors;

import java.awt.Image;


public class Sheriff extends Enemy{
    
    int moves;
    
    public Sheriff(int x, int y, Image img, String name) {
        super(x, y, img, name);
        moves = 3;
    }
    
    public Sheriff(int x, int y, Image img, String name, int damage, int attack, int moves) {
        super(x, y, img, name, damage, attack);
        this.moves = moves;
    }
    
    public int getAttack() {
        if (moves == 0) {
            return attack*2;
        }
        return attack;
    }
}
