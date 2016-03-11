package monsterrandomizer;

import java.util.ArrayList;

/**
 * Actor is the object which contains all DropItems for a certain replacer. 
 * @author edwinfinch
 */
public class Actor {
    private final String DEFAULT_NAME = "[unnamed]";
    private final String DEFAULT_REPLACES_NAME = "[unknown]";
    
    private ArrayList dropItems;
    public String name;
    public String replaces;
    
    /**
     * Creates a new Actor object with default values.
     */
    public Actor(){
        this.dropItems = new ArrayList();
        this.name = DEFAULT_NAME;
        this.replaces = DEFAULT_REPLACES_NAME;
    }
    
    /**
     * Creates a new actor with defined values.
     * @param newDropItems New drop items to set (ArrayList already created)
     * @param newName New name for the Actor
     * @param newReplaces The new replaces name that this Actor instance is replacing
     */
    public Actor(ArrayList newDropItems, String newName, String newReplaces){
        this.dropItems = newDropItems;
        if(this.dropItems == null){
            this.dropItems = new ArrayList();
        }
        this.name = newName;
        if(this.name == null){
            this.name = DEFAULT_NAME;
        }
        this.replaces = newReplaces;
        if(this.replaces == null){
            this.replaces = DEFAULT_REPLACES_NAME;
        }
    }
    
    /**
     * Adds a drop item to this actor.
     * @param newDropItem The new DropItem to add
     * @return The current size of the array
     */
    public int addDropItem(DropItem newDropItem){
        this.dropItems.add(newDropItem);
        
        return this.dropItems.size();
    }
    
    /**
     * Gets the drop items for this object.
     * @return The DropItems ArrayList
     */
    public ArrayList getDropItems(){
        return this.dropItems;
    }
    
    @Override
    /**
     * Returns a string in JSON like format about the current Actor object.
     */
    public String toString(){
        String actorObject = "Actor { ";
        actorObject += "dropItems: " + this.dropItems.toString() + ",\n";
        actorObject += "name: \"" + this.name + "\",\n";
        actorObject += "replaces: \"" + this.replaces + "\" }";
        
        return actorObject;
    }
    
}
