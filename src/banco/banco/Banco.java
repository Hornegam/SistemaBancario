/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import model.bean.InfoCliente;
import model.bean.Transacao;
import model.dao.InfoClienteDAO;
import model.dao.TransacaoDAO;

/**
 *
 * @author Junior
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws StackOverflowError {
//      try{ 
//Transacao eu = new Transacao(2000,2);
//TransacaoDAO teste = new TransacaoDAO();
//
//teste.criar(eu);


        InfoCliente inf = new InfoCliente();
        InfoClienteDAO teste = new InfoClienteDAO();
        
        if (teste.criar(inf)) {
            System.out.println("Salvo com sucesso");
        }else{
            System.out.println("Deu erro");
            fail("Erro ao salvar");
        }


//        backBanco cliente = new backBanco(1000);
//        backBanco cliente2 = new backBanco(2500);
//        System.out.println("Saldo Cliente 1 "+cliente.getSaldo());
////        System.out.println(cliente.getLimite());
//        cliente.depositar(10);
//        System.out.println("Saldo Cliente 1 "+cliente.getSaldo());
////        cliente.saque(1300);
//        System.out.println("Saldo Cliente 2 "+cliente2.getSaldo());
//        cliente.transferir("3521245", 500, cliente2);
//        System.out.println("Saldo Cliente 2 "+cliente2.getSaldo());
//        System.out.println("Saldo Cliente 1 "+cliente.getSaldo());
//        System.out.println(cliente.getSaldo());
//        cliente.person.depositar(0);
//        System.out.println(cliente.);
//        cliente.cadastrar();
//        cliente.showInfo();
//      }catch(StackOverflowError oe){
//          System.out.println("Deu merda !!");
//          System.out.println(oe.getLocalizedMessage());
      }

    private static void fail(String erro_ao_salvar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
