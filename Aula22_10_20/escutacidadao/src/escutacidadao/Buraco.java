/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escutacidadao;

/**
 *
 * @author CristianoLuizDiel
 */
public class Buraco {
    private int numeroIdentificacao;
    Endereco endereco;
    Localizacao localizacao;
    private float comprimento;
    private float largura;
    private float profundidade;
    private int prioridade;

    //métodos
    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
    
    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }

    public float getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(float comprimento, float largura, float profundidade) {
        float aux = comprimento * largura * profundidade;
        if (aux > 50000){
            this.prioridade = 10;
        }else {
            this.prioridade = (int)(50000/aux);
        }
        
    }
    
    
    
    
}




