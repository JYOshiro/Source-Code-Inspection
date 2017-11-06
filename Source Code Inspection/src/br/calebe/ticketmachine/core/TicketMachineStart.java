package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;

public class TicketMachineStart {
    
    public static PapelMoeda papel2 = new PapelMoeda(2,50);
    public static PapelMoeda papel5 = new PapelMoeda(5,20);
    public static PapelMoeda papel10 = new PapelMoeda(10,10);
    public static PapelMoeda pape20 = new PapelMoeda(20,5);
    public static TicketMachine machine = new TicketMachine(400); 
        
    public static void main(String [] args){        
        
        System.out.println("Saldo de 2 reais: " + papel2.getQuantidade());
           
        try{
        machine.inserir(10);
        }
        catch(PapelMoedaInvalidaException ex){
        
        }
        
        
        
    }
}
