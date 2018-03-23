/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;
import grupp4.calculator.exceptions.InvalidTokenException;
import grupp4.calculator.model.tokens.*;

/**
 *
 * @author Nick
 */
public class TokenScanner {
   /**
    * This method takes a TokenStack and a string, splits the string up into
    * tokens, and based on each token creates a Token-subclass which is then
    * pushed onto the TokenStack.
    * @param stack empty at the start
    * @param mathProblem the RPN problem
    * @throws InvalidTokenException 
    */
    public void pushLine(TokenStack stack, String mathProblem) throws InvalidTokenException{
        String line[] = mathProblem.split(" ");
        for(int x = 0; x < line.length; x++){
            stack.push(Token.tokenFactory(line[x]));
        }   
    }    
}

