
package poe;


public class CellphoneNumber {
    public boolean checkCellPhoneNumber(String number){
    
        if (number.length()==9 && number.matches("^\\d{9}$")){
           System.out.println("Cell phone number successfully added.");
           return true;
        } 
        else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");    
        }    
        return false;
        }
              
    
}
