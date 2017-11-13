package br.calebe.ticketmachine.core;
/**
 *
 * @author Jessica Oshiro
 */
public class Bilhete {
    protected int valor;
    
    public Bilhete(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
