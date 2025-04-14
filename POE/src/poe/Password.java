
package poe;


public class Password {
     public boolean checkPasswordComplexity(String password){
   
    if (password.length()>=8 && password.matches(".*[A-Z].*") &&
        password.matches(".*\\d.*") && password.matches(".*[^a-zA-Z0-9].*")){
        System.out.println("Password successfully captured");
        return true;}
       else {
       System.out.println("Password is not correctly formatted, please ensure that your password contains at least 8 characters, a capital letter, a number, and a special character.");
       }
       return false;
     }
}
