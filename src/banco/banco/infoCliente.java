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
public class infoCliente {

    private int ClienteID;
    private String Nome;
    private String sobrenome;
    private int Idade;
    private String Endereco;
    private int cpf;
    private String apelido ;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    Scanner read = new Scanner(System.in);

    public infoCliente(double ID) {

        setIND((int) ID);
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public infoCliente() {

    }

    private int getIND() {
        return ClienteID;
    }

    public void setIND(int IND) {
        this.ClienteID = IND;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void showInfo() {
        System.out.println("Aqui estão as informações do cliente : " + getIND());
        System.out.println("O Nome do(a) cliente é : " + getNome());
        System.out.println("A Idade do(a) cliente é : " + getIdade());
        System.out.println("O CPF do cliente é : " + getCpf());
        System.out.println("O Endereço do cliente é : " + getEndereco());

        System.out.println("");
        System.out.println("Essas são as informações de " + getNome());

    }

    public String criarApelido(){
    
        System.out.println("Indentifique o APELIDO do(a) cliente : ");
        String apelido = read.next();
        setApelido(apelido);
        return null ;
    }
    
    public void cadastrar() {
        String endereco = null;
        System.out.println("==================================================="
                + "\n Bem-vindo ao cadastramento do cliente ID : ");
        System.out.println("Indentifique o NOME do(a) cliente :");
        setNome(read.next());
        System.out.println("Indentifique o SOBRENOME do(a) cliente : ");
        setSobrenome(read.next());
        criarApelido();
        System.out.println("Indentifique a IDADE do(a) cliente :");
        setIdade(read.nextInt());
        System.out.println("Indentifique o CPF do(a) cliente :");
        setCpf(read.nextInt());
        System.out.println("Indentifique o ENDEREÇO do(a) cliente :");
        endereco = read.next();
        endereco += read.nextLine();
        setEndereco(endereco);
        System.out.println("=============Obrigado pelo Cadastro=================");
    }
}
