/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;
import grupp4.calculator.model.tokens.Token;
import java.util.*;
/**
 *
 * @author Nick
 */
public class TokenStack {
    private Stack <Token> tokenStack;

    public TokenStack() {
        tokenStack = new Stack();
    }
    /**
     * Pushes a token onto the stack.
     * @param token 
     */
    public void push(Token token){
        tokenStack.push(token);
    }
    /**
     * pops a token from the stack.
     * @return Token
     */
    public Token pop(){
        return(tokenStack.pop());
    }
    /**
     * returns the top Token without popping it.
     * @return Token
     */
    public Token peek(){
        return(tokenStack.peek());
    }
    /**
     * returns true if the stack is empty, false if it is not.
     * @return 
     */
    public boolean empty(){
        return(tokenStack.empty());
    }
    public int search(Token token){
        return(tokenStack.search(token));
    }
    
}
