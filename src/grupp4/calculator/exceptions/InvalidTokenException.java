/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.exceptions;

/**
 *
 * @author S153298
 */

public class InvalidTokenException extends Exception {
    public InvalidTokenException(String token){
        super("InvalidTokenException: " + token);
    }
}
