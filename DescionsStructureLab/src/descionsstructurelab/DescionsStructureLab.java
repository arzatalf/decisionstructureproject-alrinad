/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descionsstructurelab;

import java.util.Scanner;

/**
 *
 * @author alrinad
 */
public class DescionsStructureLab {

    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    System.out.printf("Would you like to go to college? yes or no......  ");
    String anwser = kb.nextLine();
    if( "yes".equals(anwser)) {
        System.out.printf("Please enter your SAT score....  ");
        int score = kb.nextInt();
            if(score >= 1340) {
                System.out.println("You can go to colleges like Harvard or Standford.\n");
            }else if(score >= 1200){
                System.out.println("You can go to colleges like New York University.\n");
            }else if(score >= 1030){
                System.out.println("You can go to colleges like UT or Penn State.\n");
            }else if(score >= 830){
                System.out.println("You can go to colleges like High Point or Arizona State.\n");
            }else if(score <830){
                System.out.println("You can go to colleges like Prairie View A & M University.\n");
        }
    } else {
        System.out.println("Have a good day.");
        
    }
    }
    
}

