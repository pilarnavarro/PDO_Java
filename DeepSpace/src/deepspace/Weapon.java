/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepspace;

/**
 *
 * @author usuario
 */
public class Weapon {
    private String name;
    private WeaponType type;
    private int uses;
    
    public Weapon(String n,WeaponType t,int u){
        name=n;
        type=t;
        uses=u;
    }
    public Weapon(Weapon weapon){
        name=weapon.name;
        type=weapon.type;
        uses=weapon.uses;
    }
    public String getName(){
        return name;
    }
    public WeaponType getType(){
        return type;
    }
    public int getUses(){
        return uses;
    }
    public float power(){
        return type.getPower();
    }
    public float useIt(){
        if(uses>0){
            uses--; 
            return power();
        }else{
            return 1.0f;
        }
    }
    
}
