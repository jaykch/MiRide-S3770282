package exception_handling;

/*
 * Class:			InvalidDate
 * Description:		Exception Class For InvalidDate 
 * Author:			Jay Kumar
 */

public class InvalidDate extends Exception {
    String errorMessage;
    public InvalidDate(String errorMessage){
        this.errorMessage=errorMessage;
    }
    
    @Override
    public String getMessage() {
        return "Error: " + errorMessage; //To change body of generated methods, choose Tools | Templates.
    }
}
