package br.calebe.ticketmachine.core;

public class TicketMachineStart {
    
    public static PapelMoeda papel2 = new PapelMoeda(2,50);
    PapelMoeda papel5 = new PapelMoeda(5,20);
    PapelMoeda papel10 = new PapelMoeda(10,10);
    PapelMoeda pape20 = new PapelMoeda(20,5);
    TicketMachine ticket = new TicketMachine(400); 
        
    public static void main(String [] args){        
        
        System.out.println("Saldo de 2 reais: " + papel2.getQuantidade());
       
        System.out.println("Saldo de 2 reais: " + papel2.getQuantidade());
                
        
    }
}
