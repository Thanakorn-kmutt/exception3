/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

/**
 *
 * @author User
 */
public class Lab3 {
    public static void main(String[] args){
        int[] list = new int[10];
        try{
            System.out.println("Statement1");
            System.out.println(list[10]);
            System.out.println("Statement3");
        }
        
        catch(ArithmeticException e){
        }
            
        finally{
            System.out.println("Statement4");
        }
        
    System.out.println("Statement5");
    }
}
