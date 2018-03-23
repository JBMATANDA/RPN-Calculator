/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator;
import grupp4.calculator.controller.Controller;
import java.io.FileNotFoundException;


/**
 *
 * @author S153298
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            Controller controller = new Controller(args);
            controller.run();
        }
        catch(IllegalArgumentException | FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
