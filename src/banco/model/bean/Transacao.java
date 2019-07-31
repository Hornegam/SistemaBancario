/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Junior
 */
public class Transacao {
    private int idTransacao ;
    private double saldo ;
    private double limite ;

    Cliente teste = new Cliente();
    public Transacao(){}
    
    public Transacao(double saldo,int IdCliente){
        this.saldo = saldo ;
        this.limite = limite;
        setIdTransacao(IdCliente) ;
    }
    
    public int getIdTransacao() {
        
        return idTransacao;
    }

public void setIdTransacao(int idTransacao) {
    this.idTransacao = idTransacao;
}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
