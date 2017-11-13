package br.calebe.ticketmachine.exception;

import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    
    protected String PapelMoedaInvalido = "Este dispositivo só aceita moeda de 2, 5, 10, 20 ,50, 100";
   
    public String getPapelMoedaInvalido(){
        return PapelMoedaInvalido;
    }
}
