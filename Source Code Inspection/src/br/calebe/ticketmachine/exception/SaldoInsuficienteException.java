package br.calebe.ticketmachine.exception;

import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
      
   protected String SaldoInsuficiente = "Saldo insuficiente, por favor completar o valor.";
   
   public String getSaldoInsuficiente(){
       return SaldoInsuficiente;
   }
}
