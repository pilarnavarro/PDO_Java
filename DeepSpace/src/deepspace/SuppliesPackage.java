
package deepspace;

/**
 *
 * @author Pilar y Silvia
 */
public class SuppliesPackage {
    private float ammoPower;
    private float fuelUnits;
    private float shieldPower;
    
    SuppliesPackage(float ammo_power, float fuel_units, float shield_power){
        this.ammoPower=ammo_power;
        this.fuelUnits=fuel_units;
        this.shieldPower=shield_power;
    }
    
    SuppliesPackage(SuppliesPackage p){
        ammoPower=p.ammoPower;
        fuelUnits=p.fuelUnits;
        shieldPower=p.shieldPower;
    }
    
    
    public float getAmmoPower(){return ammoPower;}
    public float getFuelUnits(){return fuelUnits;}
    public float getShieldPower(){return shieldPower;}
   
    @Override
    public String toString(){
        return "\tPotencia de armamento: " +ammoPower
        + " \tCombustible: " +fuelUnits+"\tEnergía para los escudos "+shieldPower;
    }
}
