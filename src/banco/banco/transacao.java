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
public class transacao {

    private int id;
    private double saldo;

    public transacao() {
    }

    /**
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public transacao(double saldo) {

//        setId(ID);
        setSaldo(saldo);
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public double saque(double quantia) {
        
        return quantia;
    }

    
    
    public double depositar(double quantia) {
        System.out.println("O valor de R$" + quantia + " foi depositado com sucesso !");
        return quantia;

    }

}
