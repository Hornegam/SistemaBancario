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
        this.espere = new transacao(saldo);
//        this.Id = ID ;
    }

    transacao espere;

    public backBanco() {
        
    }
    
    public void transferir(String cpf,double valor, backBanco c2){
        if (valor > (getLimite()+getSaldo())) {
            System.out.println("Transferência não autorizada !");
        }else{
            c2.setSaldo(c2.getSaldo()+valor);
            setSaldo(getSaldo()-valor);
            System.out.println("Transferência concluida com sucesso !");
        }
    
    }

    public void saque(double quantia) {
        if (espere.saque(quantia) > (getLimite() + getSaldo())) {
            System.out.println("Saque não autorizado !");
            System.out.println("Verifique seu saldo e seu limite !");
        } else {
            setSaldo(getSaldo()-espere.saque(quantia));
        }
    }

    public void depositar(double quantia) {
        setSaldo(getSaldo() + espere.depositar(quantia));

    }

    public int getID() {
        return Id;
    }

    public void setID(int ID) {
        this.Id = ID;
    }

    public double getSaldo() {
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
