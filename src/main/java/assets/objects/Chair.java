
package assets.objects;

import assets.GameAsset;
import assets.Throwable;
import java.awt.Image;

public class Chair extends GameAsset implements Throwable{
    
    public Chair(int x, int y, Image img) {
        super(x, y, img, "chair");
    }

    @Override
    public void throwIt(int direction) {

    }
    
}
