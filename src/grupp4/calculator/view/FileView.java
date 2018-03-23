/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author s153298
 */

public class FileView extends View {
    private Scanner in;
    private PrintWriter printer;
    
    public FileView(String input, String output) throws FileNotFoundException{
        File inputFile = new File(input);
        File outputFile = new File(output);
        try {
            in = new Scanner(inputFile);
            printer = new PrintWriter(outputFile);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        }
    }
/**
* takes a string and prints it out regardless of the message
* @param output 
*/
    @Override
    public void printOutput(String output){
        printer.println(output);
    }
/**
 * reads the next line from the input file and returns it.
 * closes the PrintWriter if the input is empty.
 * @return 
 */
    @Override
    public String getInput(){
        if (in.hasNextLine()){
            return(in.nextLine());
        }
        else {
            System.out.println("End of file reached");
            printer.close();
            System.exit(0);
            return null;
        }
    }
}
