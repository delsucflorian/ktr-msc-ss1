public class Mage extends Character implements Movable{
    public Mage (String nom){
        super(nom);
        this.setRPGClass("Mage");
        this.setLife(70);
        this.setStrength(3);
        this.setAgility(10); 
        this.setWit(10);
        System.out.println(this.getName() + ": May the gods be with me.");
    }
    public void attack(String weapon) throws WeaponException{
        if (weapon != "magic" && weapon != "wand"){
            throw new WeaponException();
        }
        if ( weapon == "magic" || weapon == "wand"){
            super.attack(weapon);
            System.out.println( this.getName()+ " : Feel the power of my " + weapon + " !") ;}
    }  
    public void tryToAttack(String weapon)throws WeaponException{
        try {
            attack(weapon);
        }
        catch (WeaponException exception){
            System.out.println(this.getName()+ ": I don't need this stupid " + weapon + " ! Don't misjudge my powers!");
            //throw new WeaponException(this.getName()+ ": I don't need this stupid " + weapon + " ! Don't misjudge my powers!");
        }
    }

    public void moveRight(){
        System.out.println(this.getName() + ": moves right furtively.");
    }
    public void moveLeft(){
        System.out.println(this.getName() + ": moves left furtively.");
    }
    public void moveBack(){
        System.out.println(this.getName() + ": moves back furtively.");
    }
    public void moveForward(){
        System.out.println(this.getName() + ": moves forward furtively.");
    }
}
