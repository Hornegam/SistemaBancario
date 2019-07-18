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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws StackOverflowError {
//      try{ 
        backBanco cliente = new backBanco(1000);
        
        System.out.println(cliente.getSaldo());
        System.out.println(cliente.getLimite());
        cliente.person.depositar(10);
        System.out.println(cliente.getSaldo()); 
//        System.out.println(cliente.getSaldo());
//        cliente.person.depositar(0);
//        System.out.println(cliente.);
//        cliente.cadastrar();
//        cliente.showInfo();
//      }catch(StackOverflowError oe){
//          System.out.println("Deu merda !!");
//          System.out.println(oe.getLocalizedMessage());
      }
    
}
