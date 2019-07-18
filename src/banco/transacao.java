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

    

    public double depositar(double quantia) {
        System.out.println("O valor de R$"+quantia+" foi depositado com sucesso !");
        setSaldo(this.saldo+quantia);
        return getSaldo();

    }

}
