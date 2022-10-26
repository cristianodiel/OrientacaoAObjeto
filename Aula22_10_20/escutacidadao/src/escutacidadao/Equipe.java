/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escutacidadao;

/**
 *
 * @author CristianoLuizDiel
 */
//atributos
public class Equipe {
    private String idEquipe;
    private int numPessoas;
    private Float custoHora;
    
//métodos

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public Float getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(Float custoHora) {
        this.custoHora = custoHora;
    }
    
    
}
