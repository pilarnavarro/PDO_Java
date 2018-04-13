
package deepspace;

/**
 *
 * @author Pilar y Silvia
 */
public class Loot {
    private int nSupplies;
    private int nWeapons;
    private int nShields;
    private int nHangars;
    private int nMedals;
    
    Loot(int supplies, int weapons, int shields, int hangars, int medals){
        this.nSupplies=supplies;
        this.nWeapons=weapons;
        this.nShields=shields;
        this.nHangars=hangars;
        this.nMedals=medals;
    }
    
    LootToUI getUIversion(){return new LootToUI(this);}
   
    public int getNSupplies(){return nSupplies;}
    public int getNWeapons(){return nWeapons;}
    public int getNShields(){return nShields;}
    public int getNHangars(){return nHangars;}
    public int getNMedals(){return nMedals;}
    
    @Override
    public String toString(){
        return "\t"+nSupplies + " suministros, " + nWeapons + " armas, " + nShields + 
        " potenciadores de escudo, " + nHangars + " hangares, " + nMedals + " medallas"; 
    }
        
    
   
}
