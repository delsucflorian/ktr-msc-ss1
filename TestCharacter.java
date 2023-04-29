public class TestCharacter {
    public static void main(String[] args) throws WeaponException {
        Warrior warrior = new Warrior("Jean-Luc"); 
        Mage mage = new Mage("Robert");
        warrior.tryToAttack("screwdriver");
        mage.tryToAttack("hammer"); 
        warrior.tryToAttack("hammer");
        try {
             mage.attack(""); 
            } 
        catch  (WeaponException e) {
            System.out.println(e.getMessage());
        }
     }
 }
    