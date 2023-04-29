public class Warrior extends Character implements Movable{
    public Warrior (String nom){
        super(nom);
        this.setRPGClass("Warrior");
        this.setLife(100);
        this.setStrength(10);
        this.setAgility(8); 
        this.setWit(3); 
        System.out.println(this.getName() + ": My name will go down in history!");
    }
    public void attack(String weapon)throws WeaponException{
        if (weapon != "hammer" && weapon != "sword"){
            throw new WeaponException();
        }
        if ( weapon == "hammer" || weapon == "sword" || weapon == null){
            super.attack(weapon);
            System.out.println( this.getName()+ " : I'll crush you with my " + weapon + " !");
        }
    }  

    public void tryToAttack(String weapon ) throws WeaponException{
        try {
            attack(weapon);
        }
        catch (WeaponException exception){
            //throw new WeaponException(this.getName()+ ": A "+ weapon + " ?? What should I do with this?!");
            System.out.println(this.getName()+ ": A "+ weapon + " ?? What should I do with this?!");
        }
    }


    public void moveRight(){
        System.out.println(this.getName() + ": moves right like a bad boy");
    }
    public void moveLeft(){
        System.out.println(this.getName() + ": moves left like a bad boy");
    }
    public void moveBack(){
        System.out.println(this.getName() + ": moves back like a bad boy");
    }  
    public void moveForward(){
        System.out.println(this.getName() + ": moves forward like a bad boy");
    }
} 