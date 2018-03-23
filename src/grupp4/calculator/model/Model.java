/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;
import grupp4.calculator.exceptions.*;


/**
 * 
 * @author S153298
 */
public class Model{
    
    TokenScanner scanner;
    
    public Model(){
        scanner = new TokenScanner();
    }
    
    /**
     * This function takes a string supposed to contain a 
     * math problem in reverse polish notation, calls another function to put
     * the tokens in a stack, and one to calculate it, and will return a string 
     * containing either the result, or an error message.
     * @param input A string consisting of a RPN problem
     * @return the answer(or error message)
     */
    public String processInput (String input){
        TokenStack stack = new TokenStack();
        try{
            scanner.pushLine(stack, input);
            String output = calculateExpression(stack);
            return(output);
        }
        catch(InvalidTokenException | ArithmeticException | InvalidOperationException e) {
            return(e.getMessage());
        }
    }

    /**
     * This function takes the the stack of tokens, and proceeds to call the 
     * calculate function for the first popped token(which calculates the rest
     * as well). It then formats the answer and returns it as a string.
     * @param stack Contains all the tokens of the math problem.
     * @return The answer in a nice format.
     * @throws InvalidOperationException 
     */
    private String calculateExpression(TokenStack stack) throws InvalidOperationException{
                try{
            double output = stack.pop().calculate(stack);
            if (stack.empty()){
                return (String.format("%.2f", output));
            }
            else throw new InvalidOperationException();
        }
        catch(InvalidOperationException | ArithmeticException e){
            throw e;
        }
    }
}
    
    

