package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import br.calebe.ticketmachine.exception.SemTrocoException;
import java.text.DecimalFormat;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};
    protected Bilhete bilhete = new Bilhete(10);
    protected int qtdBilhetes;

    public TicketMachine(int valor, int qtdBilhetes) {
        this.valor = valor;
        this.saldo = 0;
        this.qtdBilhetes = qtdBilhetes;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }
    
    public void emitir() throws SaldoInsuficienteException{
        boolean emitir = false;
        if(this.qtdBilhetes > 0 ){
            if(this.saldo >= bilhete.getValor())
                this.saldo = this.saldo - bilhete.getValor();
            else
                throw new SaldoInsuficienteException();
        }else{            
        }
    }
    
    public boolean VerificaTroco(PapelMoeda papel2, PapelMoeda papel5, PapelMoeda papel10, 
            PapelMoeda papel20, PapelMoeda papel50,PapelMoeda papel100) throws SemTrocoException{
        
        if (saldo <= 0)
            throw new SemTrocoException();
        else {
            int nota[] = {100, 50, 20, 10, 5, 2};
            
            double troco;
            int i, vlr, ct;

            troco = saldo;
            
            if(troco > 0){            
                // definindo as notas do troco (parte inteira)
                vlr = (int)troco;
                i = 0;
                while (vlr != 0) {
                    ct = vlr / nota[i]; // calculando a qtde de notas
                    if (ct != 0) {                    
                        switch (ct){
                            case 2:
                                if(papel2.quantidade <= 0){
                                    return false;
                                }
                                break;
                            case 5:
                                if(papel5.quantidade <= 0){
                                    return false;
                                }
                                break;
                            case 10:
                                if(papel10.quantidade <= 0){
                                    return false;
                                }
                                break;
                            case 20:
                                if(papel20.quantidade <= 0){
                                    return false;
                                }
                                break;
                            case 50:
                                if(papel50.quantidade <= 0){
                                    return false;
                                }
                                break;
                            case 100:
                                if(papel100.quantidade <= 0){
                                    return false;
                                }  
                                break;
                        }         
                        vlr = vlr % nota[i]; // sobra
                    }
                    i = i + 1; // próxima nota
                }
            }else{
                throw new SemTrocoException();
            }
        }
        return true;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public int getVlrBilhete(){
        return bilhete.getValor();
    }
    
    public Iterator<Integer> getTroco() {
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
