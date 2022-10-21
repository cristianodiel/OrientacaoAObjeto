/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author roberta.parcianello
 */
public class Aluno extends Pessoa{
    //aluno é uma Pessoa com TODOS os atributos e 
    // métodos de Pessoa
    
    //atributos específicos de Aluno
    private String escolaridade;
    private String anoIngresso;
    
    //métodos de acesso

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
}
