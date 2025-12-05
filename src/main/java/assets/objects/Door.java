
package assets.objects;

import assets.GameAsset;
import java.awt.Image;


public class Door extends GameAsset{
    
    boolean open;
    
    public Door(int x, int y, Image img) {
        super(x, y, img, "door");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    
}
