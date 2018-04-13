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
public enum WeaponType {
    LASER(2.0f),
    MISSILE(3.0f),
    PLASMA(4.0f);
    
    private float power;
    
    /*
    Hace falta poner public?
    */
    WeaponType(float p){
        power=p;
    }
    public float getPower(){
        return power;
    }
    @Override
    public String toString(){
        String mensaje="\t";
        if (getPower()==2.0)
           mensaje+="LASER";
        else if (getPower()== 3.0)
            mensaje += "MISSILE";
        else if (getPower()== 4.0)
            mensaje += "PLASMA";
        mensaje += "\tPotencia: "+power+"\n";
        return mensaje;
    }
}
