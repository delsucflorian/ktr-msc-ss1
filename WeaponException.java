public class WeaponException extends Exception{
    public String message; 
    public WeaponException(){
        super();
    }
    public WeaponException(String mes){
        super(mes);
        message = mes;
    }
    public String getMessage(){
        return message;
    }
    
}