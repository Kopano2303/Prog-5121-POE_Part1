
package poe;

import java.util.Scanner;


public class POE {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Username username = new Username();
        Password checkpassword = new Password();
        CellphoneNumber phonenumber = new CellphoneNumber();
        
        String Name;
        String password;
        String SAnumber;
        String capturedUsername;
        String capturedPassword;
        String capturedNumber;
        String firstName;
        String lastName;
        int attempts;
        
        System.out.println("Enter your first name:");    
        firstName = scan.nextLine();
        System.out.println("Enter your last name:");
        lastName = scan.nextLine();
        
        do{
        System.out.println("Enter your username:");
        Name = scan.nextLine();
        }while(!username.checkUserName(Name));
                 
        do{
        System.out.println("Enter your password:");
        password = scan.nextLine();
        }while(!checkpassword.checkPasswordComplexity(password));
        
        do{
        System.out.println("Enter your south african number:");
        System.out.print("+27");
        SAnumber = scan.nextLine();}
        while (!phonenumber.checkCellPhoneNumber(SAnumber));
        
        System.out.println("Thank you for registering");
        
        attempts = 0;
        do{
        System.out.println("Enter captured username:");
        capturedUsername = scan.nextLine();
        if(!capturedUsername.equals(Name)){
        System.out.println("Incorrect Username"); 
        attempts++;
        }   
        }while(!capturedUsername.equals(Name )&& attempts<3);  
        if (attempts==3){
        System.out.println("Unsuccessful login, username entered is incorrect");    
        return ;    
        }
        
        attempts = 0;
        do{
        System.out.println("Enter captured password:");
        capturedPassword = scan.nextLine();
        if(capturedPassword.equals(password)){
        System.out.println("Incorrect password");
        attempts++;
        }
        }while(!capturedPassword.equals(password));
        if (attempts==3){
        System.out.println("Unsuccessful login, password entered is incorrect");    
        return ;    
        }
        
        attempts = 0;
        do{
        System.out.println("Enter captured SA number:");  
        System.out.print("+27");
        capturedNumber = scan.nextLine();
        if(capturedNumber.equals(SAnumber)){
        System.out.println("Incorrect number");
        attempts++;
        }    
        }while(!capturedNumber.equals(SAnumber));
        if (attempts==3){
        System.out.println("Unsuccessful login, number entered is incorrect");    
        return ;    
        }
       
        System.out.println("Thank you");
        System.out.println("Welcome " + firstName + "" + lastName + "it is great to see you again " );
        }
    
    
}
