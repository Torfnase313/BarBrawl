
package assets.objects;

import assets.GameAsset;
import java.awt.Image;


public class Drinks extends GameAsset {
    
    int alcContent;
    
    public Drinks(int x, int y, Image img, String name, int alcContent) {
        super(x, y, img, name);
        this.alcContent = alcContent;
    }

    public int getAlcContent() {
        return alcContent;
    }
    
    
    
}
