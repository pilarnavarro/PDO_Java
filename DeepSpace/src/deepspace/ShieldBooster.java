package deepspace;

/**
 *
 * @author Pilar y Silvia
 */

public class ShieldBooster {
    private String name; 
    private float boost; 
    private int uses;
    
    public ShieldBooster(String name, float boost, int uses){
        this.name=name;
        this.boost=boost;
        this.uses=uses;
    }
    
    public ShieldBooster(ShieldBooster booster){
        this.name=booster.name;
        this.boost=booster.boost;
        this.uses=booster.uses;
    }
    
    public float getBoost(){return boost;}
    public int getUses(){return uses;}
    
    public float useIt(){
        if(uses>0){
            uses--;
            return boost;
        }
        
        return 1.0f;
    }
}
