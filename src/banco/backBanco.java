/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Junior
 */
public class backBanco extends infoCliente {

    private double saldo;
    private int Id;

    public backBanco(double saldo) {
        super(saldo);
        setSaldo(saldo);
        this.person = new transacao(saldo);
//        this.Id = ID ;
    }
    
    transacao person;
    
 
    
    public int getID() {
        return Id;
    }

    public void setID(int ID) {
        this.Id = ID;
    }
    
    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    private double limite;

    public double getLimite() {
        return (this.saldo / 100) * 30;
    }

}
