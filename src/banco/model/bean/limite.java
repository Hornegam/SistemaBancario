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
public class limite {
    private double saldo ;
    private double limite;
    private int ClienteID ;
    
    public double calculalimite(double sal){
       return this.limite = (saldo/100)*20;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return calculalimite(this.limite);
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }
    
    
    
}
