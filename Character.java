public class Character {
   private String name; 
    private int life ; 
    private String RPGclass;
    private int agility;
    private int strength;
    private int wit;


    public Character(String nom){
        life = 50;
        name = nom; 
        RPGclass= "Character";
        agility =2 ; 
        strength = 2 ; 
        wit = 2;
    }


    public String getName (){
        return this.name;
    }

    public String getRPGClass (){
        return RPGclass; 
    }
    public int getLife(){
        return life;
    }
    public int getWit(){
        return wit;
    }
    public int getStrength(){
        return strength;
    }
    public int getAgility(){
        return agility;
    }
    public void setLife(int vie){
        life = vie;
    }
    public void setAgility(int agi){
        agility = agi;
    }
    public void setWit(int pouvoir){
        wit = pouvoir;
    }
    public void setRPGClass(String Class){
        RPGclass = Class;
    }
    public void setStrength(int force){
        strength = force;
    }
    public void attack(String weapon) throws WeaponException {
        if (weapon == null){
            throw new WeaponException("I refuse to fight with my bare hands. ");
        }
        System.out.println( this.name+ " : Rrrrrrrr");
    }
    public void moveRight(){
        System.out.println(this.getName() + ": moves right");
    }
    public void moveLeft(){
        System.out.println(this.getName() + ": moves left");
    }
    public void moveBack(){
        System.out.println(this.getName() + ": moves back");
    }
    public void moveForward(){
        System.out.println(this.getName() + ": moves forward");
    }

    public boolean unsheathe(boolean p){
        if (p == false) {
            System.out.println(": Unsheathes my weapon.");
        }
            return p ==true ;
    } 
}


