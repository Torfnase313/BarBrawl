
package assets.actors;

import assets.GameAsset;
import java.awt.Image;

public class NPC extends GameAsset{
    
    String text;
    
    public NPC(int x, int y, Image img, String name) {
        super(x, y, img, name);
        this.text = "Hello!";
    }
    
    public NPC(int x, int y, Image img, String name, String text) {
        super(x, y, img, name);
        this.text = text;
    }
        
    public String talk() {
        return this.text;
    }
 
}
