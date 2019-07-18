/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class infoCliente   {
int IND  ;
String Nome ;
int Idade ;
String Endereco ;
String cpf ;
Scanner read = new Scanner(System.in);

public infoCliente(double ID) {
       
    setIND((int) ID);
    }

    private int getIND() {
        return IND;
    }

    public void setIND(int IND) {
        this.IND = IND;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
    public void showInfo(){
        System.out.println("Aqui estão as informações do cliente : "+getIND());
        System.out.println("O Nome do(a) cliente é : "+getNome());
        System.out.println("A Idade do(a) cliente é : "+getIdade());
        System.out.println("O CPF do cliente é : "+getCpf());
        System.out.println("O Endereço do cliente é : "+getEndereco());
        
        System.out.println("");
        System.out.println("Essas são as informações de "+getNome());
    
    }
    
    public void cadastrar(){
        System.out.println("==================================================="
                + "\n Bem-vindo ao cadastramento do cliente ID : "+getIND());
        System.out.println("Indentifique o NOME do(a) cliente "+getIND());
        setNome(read.next());
        System.out.println("Indentifique a IDADE do(a) cliente "+getIND());
        setIdade(read.nextInt());
        System.out.println("Indentifique o CPF do(a) cliente "+getIND());
        setCpf(read.next());
        System.out.println("Indentifique o ENDEREÇO do(a) cliente "+getIND());
        setEndereco(read.nextLine());
    }
}
