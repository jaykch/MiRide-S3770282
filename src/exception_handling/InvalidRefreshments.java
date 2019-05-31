package exception_handling;

/*
 * Class:			InvalidRefreshments
 * Description:		Exception Class For InvalidRefreshments 
 * Author:			Jay Kumar
 */
public class InvalidRefreshments extends RuntimeException {

    String errorMessage;

    public InvalidRefreshments(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return "Error: " + errorMessage; //To change body of generated methods, choose Tools | Templates.
    }
}
