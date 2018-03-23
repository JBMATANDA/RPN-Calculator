/*
*/
package grupp4.calculator.controller;
import grupp4.calculator.view.*;
import grupp4.calculator.model.*;
import java.io.FileNotFoundException;

/**
 *
 * @author S153298
 */
public class Controller{
    private View view;
    private Model model;
    
    public Controller(String[] args) throws FileNotFoundException{
        try{
            view = View.getViewType(args);
            model = new Model();
        }
        catch(FileNotFoundException e){
            throw e;
        }
    }
    /**
     * Continously requests input and prints out the answer, until no more input
     * is given, at which points the program ends.
     * @throws IllegalArgumentException
     * @throws FileNotFoundException 
     */
    public void run() throws IllegalArgumentException, FileNotFoundException{
        while(true){
            String input = view.getInput();
            if(input == null || input.isEmpty()){
                System.out.println("Användaren avslutade applikationen");
                System.exit(0);
            }
            String output = model.processInput(input);
            view.printOutput(output);
        }
    }
}
