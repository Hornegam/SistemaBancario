/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import banco.backBanco;
import banco.infoCliente;
import banco.transacao;
import java.util.Scanner;
import model.dao.TransacaoDAO;

/**
 *
 * @author Junior
 */
public class InfoCliente {

    private int cpf;
    private String nome;
    private String sobrenome;
    private int idade;
    private String endereco;
    private int IdCliente;
    private String apelido ;
    Scanner read = new Scanner(System.in);
    transacao back = new transacao();

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    infoCliente inf = new infoCliente();
    Cliente cli = new Cliente();

    public int getIdCliente() {
        return cli.getIdCliente();
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public InfoCliente() {
        inf.cadastrar();
        this.cpf = inf.getCpf();
        this.nome = inf.getNome();
        this.sobrenome = inf.getSobrenome();
        this.idade = inf.getIdade();
        this.endereco = inf.getEndereco();
        this.apelido = inf.getApelido();
        System.out.println("");
        depositoInfo();
    }
    
    public void depositoInfo(){
    
        System.out.println("Sr(a). "+getNome()+" deseja depositar alguma quantia em sua conta ?");
        System.out.println("===================Digite 1 para SIM===============================");
        System.out.println("===================Digite 2 para NÃO===============================");
        int deci = read.nextInt();
        if(deci == 1){
            System.out.println("Digite a quantidade a ser depositada : R$");
            double valor = read.nextDouble();
            back.depositar(valor);
            Transacao trans = new Transacao(valor,inf.getCpf());
            TransacaoDAO transDAO = new TransacaoDAO();
            transDAO.criar(trans);
        }
        else{
            Transacao trans = new Transacao(0,getCpf());
            System.out.println("=========Obrigado por criar uma conta em nosso banco===========");
        }
    
    }

    public InfoCliente(int cpf, String nome, String sobrenome, String endereco, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.IdCliente = IdCliente ;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
