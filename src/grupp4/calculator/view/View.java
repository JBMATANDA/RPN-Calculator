/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;

import java.io.FileNotFoundException;


/**
 *
 * @author s153298
 */
public abstract class View {

    public abstract String getInput();
    public abstract void printOutput(String output);

    /**
     * this is a factory method that determines what type of view is required
     * and return the type.
     * @param args
     * @return View-subclass
     * @throws IllegalArgumentException
     * @throws FileNotFoundException 
     */
    public static View getViewType(String[] args) throws IllegalArgumentException, FileNotFoundException{
        if (args.length == 0){
            return(new ConsoleView());
        }
        else if (args.length == 2){
            try{
                return new FileView(args[0], args[1]);
            }    
            catch(FileNotFoundException e){
                throw e;
            }
        }
        else{
            throw new IllegalArgumentException("Syntax: java Calculator [källfil destinationsfil]");
        }
    }
}
