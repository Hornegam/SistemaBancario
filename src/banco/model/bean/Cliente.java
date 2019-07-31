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
public class Cliente {
    private String apelido ;
    private int idCliente ;
    private int CPF ;

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    private InfoCliente infoCliente ;
    private Transacao transacao ;

    public Cliente() {
    }

    public Cliente(String apelido,int CPF ) {
        this.apelido = apelido;
        this.CPF = CPF ;
        this.idCliente = idCliente;
        this.infoCliente = infoCliente;
        this.transacao = transacao;
    }

    
    
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public InfoCliente getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(InfoCliente infoCliente) {
        this.infoCliente = infoCliente;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }
    
    
}
