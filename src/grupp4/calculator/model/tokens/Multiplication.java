/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.exceptions.InvalidOperationException;
import grupp4.calculator.model.TokenStack;

/**
 *
 * @author S153298
 */
public class Multiplication extends Operator{
/**
 * This function is used when a Multiplication operator is encountered and will apply
 * the operator on two tokens in the stack.
 * @param stack
 * @return the answer
 * @throws InvalidOperationException 
 */

    @Override
    public double calculate (TokenStack stack) throws InvalidOperationException{
        if(!stack.empty()){
            Token a = stack.pop();
            double a2 = a.calculate(stack);
            if(!stack.empty()){
                Token b = stack.pop();
                double b2 = b.calculate(stack);
                return(a2 * b2);
            }
            else throw new InvalidOperationException(); 
        }
        else throw new InvalidOperationException();
    }
         /**
     * returns a string representation of the operator
     * @return
     */   
    @Override
    public String toString(){
        return("*");
    }
}
