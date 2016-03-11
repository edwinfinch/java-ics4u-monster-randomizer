package monsterrandomizer;

/**
 *
 * @author edwinfinch
 */
public class DropItem {
    public String name;
    public int chance;
    
    public DropItem(){
        this.name = "";
        this.chance = 0;
    }
    
    public DropItem(String newName, int newChance){
        this.name = newName;
        this.chance = newChance;
    }
}
