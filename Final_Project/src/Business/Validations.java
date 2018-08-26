/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Apurva Sawant
 */
public class Validations {
    public static boolean isDigit(String input){
        
          String regex = "^[0-9]{0,9}$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          boolean output=matcher.matches();
          
          return output;
    }
    
    public static boolean isPhoneNumber(String input)
    {

        String regex = "^([0-9]{3})-([0-9]{3})-[0-9]{4}$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          boolean output=matcher.matches();
          
          return output;
    }
    
    public static boolean isValidEmailId(String input){
        
          String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.[A-Za-z]$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          boolean output=matcher.matches();
          
          return output;
    }
    
//    private boolean isUserNameUnique(String name){
//    
//        for(UserAccount: getUserAccountDirectory())
//    }
}
