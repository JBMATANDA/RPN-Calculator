/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;

import java.util.Scanner;

/**
 *
 * @author s153298
 */

public class ConsoleView extends View {
/**
 * Takes a String from the user and return it.
 * @return 
 */
    @Override
    public String getInput(){
        System.out.println("Ange RPN uttryck <retur> (tom sträng = avsluta):");
        Scanner in = new Scanner(System.in);
        return(in.nextLine());
    }
/**
 * Takes a string and prints it out.
 * @param Output 
 */
    @Override
    public void printOutput(String Output){
        System.out.println(Output);
    }
}
