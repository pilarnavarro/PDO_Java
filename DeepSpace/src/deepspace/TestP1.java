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
public class TestP1 {
    public static void main(String[] args){
        Loot loot1=new Loot(2,3,1,3,4);
        ShieldBooster booster1=new ShieldBooster("Alto Voltaje", 50.32f,3);
        ShieldBooster booster2=new ShieldBooster(booster1);
        SuppliesPackage package1=new SuppliesPackage(45.6f,32.1f, 78.6f);
        SuppliesPackage package2=new SuppliesPackage(package1);
        
        System.out.println("El contenido de loot1 es " + loot1.getNSupplies() + 
        " suministros, " + loot1.getNWeapons() + " armas, " + loot1.getNShields() + 
        " potenciadores de escudo, " + loot1.getNHangars() + " hangares, " + loot1.getNMedals() + " medallas" );
        
        System.out.println("La información del primer potenciador de escudo " +  
        "es: Potencia " + booster1.getBoost() + " Usos " + booster1.getUses());
        
        System.out.println("La información del segundo potenciador de escudo " +  
        "es: Potencia " + booster2.useIt() + " Usos " + booster2.getUses());
        
        System.out.println("Paquete de suministros 1: Potencia de armamento " + package1.getAmmoPower()
        + " Combustible " + package1.getFuelUnits()+" Energía para los escudos "+package1.getShieldPower());
        
        System.out.println("Paquete de suministros 2: Potencia de armamento " + package2.getAmmoPower()
        + " Combustible " + package2.getFuelUnits()+" Energía para los escudos "+ package2.getShieldPower());
        
        Weapon weapon=new Weapon("arma1",WeaponType.LASER,1);
        System.out.println("Nombre del arma:"+weapon.getName());
        System.out.println("Potencia del arma:"+weapon.getType().getPower());
        
        Dice mydice=new Dice();
        int c1[]={0,0};
        int c2[]={0,0};
        int contador1[]={0,0};
        int contador2[]={0,0,0};
        int contador3[]={0,0};
       
        for(int i=0;i<100;i++){
            if(mydice.spaceStationMoves(0.2f))
                c1[0]++;
            else
                c1[1]++;
            
            if(mydice.firstShot()==GameCharacter.SPACESTATION)
                c2[0]++;
            else
                c2[1]++; 
            
             System.out.println(mydice.whoStarts(40));
             
            if(mydice.initWithNHangars()==0){
                contador1[0]++;
            }else{
                contador1[1]++;
            }
        
            if(mydice.initWithNWeapons()==1){
                contador2[0]++;
            }else if(mydice.initWithNWeapons()==2){
                contador2[1]++;
            }else{
                contador2[2]++;
            }
        
            if(mydice.initWithNShields()==0){
                contador3[0]++;
            }else{
                contador3[1]++;
            }
            
        }
        
       System.out.println("La estación espacial se mueve: "+c1[0]+"\tNo se mueve: "+c1[1] );
       System.out.println("Dispara la estación espacial: "+c2[0]+"\tDispara nave enemiga: "+c2[1]);
        System.out.println("La probabilidad de que initWithNHangars() sea 0 es " + contador1[0]);
        System.out.println("La probabilidad de que initWithNHangars() sea 1 es " + contador1[1]);
       
       if(contador1[0]==25 && contador1[1]==75){
            System.out.println("La probabilidad de initWithNHangars() es correcta");
        }else{
            System.out.println("La probabilidad de initWithNHangars() es incorrecta");
        }
        
        System.out.println("La probabilidad de initWithNWeapons() sea 1 es " +contador2[0]);
        System.out.println("La probabilidad de initWithNWeapons() sea 2 es " +contador2[1]);
        System.out.println("La probabilidad de initWithNWeapons() sea 3 es " +contador2[2]);
        
        if(contador2[0]==33 && contador2[1]==33 && contador2[2]==34){
            System.out.println("La probabilidad de initWithNWeapons() es correcta");
        }else{
            System.out.println("La probabilidad de initWithNWeapons() es incorrecta");
        
        }
        
        System.out.println("La probabilidad de initWithNShield() sea 0 es " +contador3[0]);
        System.out.println("La probabilidad de initWithNShield() sea 1 es " +contador3[1]);
    }
    
}
