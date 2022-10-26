/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escutacidadao;

/**
 *
 * @author CristianoLuizDiel
 */
public class Endereco {
    //atributos
    private String logradouroTipo;
    private String logradouro;
    private int numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    //métodos

    public String getLogradouroTipo() {
        return logradouroTipo;
    }

    public void setLogradouroTipo(String logradouroTipo) {
        this.logradouroTipo = logradouroTipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
