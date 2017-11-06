package br.calebe.ticketmachine.core;

public class TicketMachineStart {
    public static void main(String [] args){
        PapelMoeda papel = new PapelMoeda(5,100);
        TicketMachine ticket = new TicketMachine(100); 
    }
}
