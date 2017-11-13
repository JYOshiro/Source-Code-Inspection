package br.calebe.ticketmachine.exception;
/**
 *
 * @author Jessica Oshiro
 */
public class SemTrocoException extends Exception{
    protected String SemTroco = "Sem troco";
    
    public String getSemTroco(){
       return SemTroco;
   }
}
