/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hungerstatus;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class HungerStatus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner hunger = new Scanner(System.in);
        
        System.out.println("Hi there what is your name?");
        String name = hunger.nextLine();
        
        System.out.println("Hi " + name + " what is your favourite meal?");
        String favMeal = hunger.nextLine();
        
        System.out.println("Hi " + name + " are you hungry? (Yes/No)");
        String hungry = hunger.nextLine().toLowerCase();//Priming input  
        
        while (hungry.equals("yes")){
            System.out.println("You can take another bite of "
            + favMeal + " " + name);
            
            System.out.println( name + " are you still hungry?");
            
            hungry = hunger.nextLine().toLowerCase();// Updating the priming input
            
            
        }
        while(!hungry.equals("yes") && !hungry.equals("no")){
                System.out.println("Please select either YES or NO");
                System.out.println("Hi " + name + " are you hungry? (Yes/No)");
                hungry = hunger.nextLine().toLowerCase();
            }
        System.out.println("Great! You are now full");
        hunger.close();
    }
    
}
