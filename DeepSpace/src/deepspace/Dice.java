
package deepspace;
import java.util.Random;
/**
 *
 * @author Pilar y Silvia
 */
public class Dice{
    
    private Random generator;
    private final float NHANGARSPROB=0.25f;
    private final float NSHIELDSPROB=0.25f;
    private final float NWEAPONSPROB=0.33f;
    private final float FIRSTSHOTPROB=0.5f;
    
    Dice(){
        generator=new Random();
    }
    
    public int initWithNHangars(){
        double x=generator.nextDouble();
        
        if(x<=NHANGARSPROB){
            return 0;
        }else{
            return 1;
        }
    }
    
    public int initWithNWeapons(){
        double x=generator.nextDouble();
        if(x<=NWEAPONSPROB){
            return 1;
        }else if(x<=2*NWEAPONSPROB){
            return 2;
        }else{
            return 3;
        }
    }
    
    public int initWithNShields(){  //devuelve 0 con una probabilidad de NSHIELDSPROB y 1 en caso contrario.
        if(generator.nextDouble()<=NSHIELDSPROB)
            return 0;
        else
            return 1;
    }

    
    public int whoStarts(int nPlayers){
        return generator.nextInt(nPlayers);
    }

    public GameCharacter firstShot(){ // genera SPACESTATION con una probabilidad de FIRSTSHOTPROB y ENEMYSTARSHIP en otro caso
        if(generator.nextDouble()<= FIRSTSHOTPROB)
              return GameCharacter.SPACESTATION;
        else 
              return GameCharacter.ENEMYSTARSHIP;
    }
    
    public boolean spaceStationMoves(float speed){
        if(generator.nextDouble()<=speed)
            return true;
        else
            return false;
    }
}