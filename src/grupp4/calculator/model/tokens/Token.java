/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;
import grupp4.calculator.exceptions.InvalidOperationException;
import grupp4.calculator.exceptions.InvalidTokenException;
import grupp4.calculator.model.TokenStack;
import static java.lang.Character.isDigit;

/**
 *
 * @author S153298
 */

public abstract class Token {

    public abstract double calculate (TokenStack stack) throws InvalidOperationException;
    public abstract String toString();
/**
 * This is a factory-type method which takes a string, determines what type of
 * token it is, and returns that type.
 * @param token
 * @return Token-subclass
 * @throws InvalidTokenException 
 */    
    public static Token tokenFactory(String token) throws InvalidTokenException{
        if(Token.isOperand(token)){
            return new Operand(Double.valueOf(token));
        }
        else if(Token.isOperator(token)){                            
            switch (token) {
                case "+":
                    return new Addition();
                case "-":
                    return new Subtraction();
                case "*":
                    return new Multiplication();
                case "/":
                    return new Division();
                case "%":
                    return new Modulus();
            }
        }
        else throw new InvalidTokenException(token);
        return null;
    }
/**
 * Determines if a string is a valid operand.
 * @param value
 * @return boolean
 */
    public static boolean isOperand(String value){
        if(value.equals("-")) return (false);               
        char[] tokenArr;
        tokenArr = value.toCharArray();
        boolean comma = false;
        for(int i = 0; i < value.length(); i++){
            if(!isDigit(tokenArr[i])){
                if((tokenArr[i] == '.') && !comma){
                    comma = true;
                }
                else if(tokenArr[i] == '-' && i == 0){}
                else return(false);
            }
        }
        return(true);
    }
/**
 * Determines if a string is a valid operator.
 * @param value
 * @return boolean
 */
    public static boolean isOperator(String value){
        if(value.equals("+") || value.equals("-") || value.equals("*") || 
                value.equals("/")|| value.equals("%"))
            return(true);
        else return(false);
    }
}
