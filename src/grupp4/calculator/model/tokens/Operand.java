/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.model.TokenStack;

/**
 *
 * @author S153298
 */
public class Operand extends Token{
    private double value;
    
    public Operand(Double value){
        this.value = value;
    }
 /**
 * This function is used when an operand is encountered, and returns the value
 * of the operand.
 * @param stack
 * @return value
 */
    @Override
    public double calculate (TokenStack stack){
        return(value);
    }
    /**
     * returns a string representation of the value
     * @return
     */
    @Override
    public String toString(){
        return(String.valueOf(value));
    }
}