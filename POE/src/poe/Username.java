
package poe;


public class Username {
 public boolean checkUserName(String name){
     if (name.length()<=5 && name.contains("_"))
     {System.out.println("Username successfully captured");
       return true;}
     else
     {System.out.println("Username is not correctly formated, please ensure that your username contains an underscore and is no more than 5 characters in length");} 
                       
     return false;
  }
    
 
 
}
