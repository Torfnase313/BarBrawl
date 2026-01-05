
package assets.actors;

import assets.GameAsset;
import java.awt.Image;
import java.util.Random;

public class NPC extends GameAsset{
    
    String[] text;
    int healthpoints;
    String[] inventar;
    boolean alive;
    String[] greetings;
    String greeting;
    
    //npc der random begrüßung/beleidigung sagt, der aber getötet werden kann und evtl was dropt
    public NPC(int x, int y, Image img, String name, int healthpoints, String[] inventar, String[] greetings) {
        super(x, y, img, name)
        Random r = new Random();
        int whichGreeting = r.nextInt(10) //anzahl der unterschiedlichen greetings die es so gibt
        this.greetings = greetings[whichGreeting];
        this.alive = true;
        this.healthpoints = healthpoints;
        this.inventar = inventar;
    }

    //npc mit text
    public NPC(int x, int y, Image img, String name, String[] text, int healthpoints, String[] inventar) {
        super(x, y, img, name);
        this.text = text;
        this.alive = true;
        this.healthpoints = healthpoints;
        this.inventar = inventar;
    }

    public void move() {
    }
    
    public String talk() {
        return this.text;
    }
 
}
