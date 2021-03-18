/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maticsv;

/**
 *
 * @author dabro
 */
public class MatiCSV 
{

    public static boolean isNumeric(String string) {
    int intValue;
		
   // System.out.println(String.format("Parsing string: \"%s\"", string));
		
    if(string == null || string.equals("")) {
       System.out.println("String cannot be parsed, it is null or empty.");
        return false;
    }
    
    try {
        intValue = Integer.parseInt(string);
        return true;
    } catch (NumberFormatException e) {
        System.out.println("Input String cannot be parsed to Integer.");
    }
    return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    
       for(int i=0;i<args.length;i++)
       { String[] csv =args[i].split(",");//podział string do tablicy
       int suma=0;
        for(int ii=0;ii<csv.length;ii++){
           
           if(isNumeric(csv[ii])) 
           { 
           int a= Integer.parseInt(csv[ii]);
            suma+=a;
           } 
           else {
           System.out.println("String is not numeric.");
                }
           
                                       }
        System.out.print(suma+" ");
       suma=0;
       }
       
               
               
               
                                            }
    
}
