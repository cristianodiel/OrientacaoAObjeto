/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escutacidadao;

/**
 *
 * @author CristianoLuizDiel
 */
public class OrdemServico {
    Buraco buraco;
    private String localizacao;
    private String tamanho;
    private int numeroEquipe;
    private int numeroPessoas;
    private String equipamento;
    private Float hora;
    private String estadoDoBuraco;
    //private Float horasTrabalhadas;
    private Float qtidadeMaterial;
    private Float custos;
    
    /*Equipe equipe;
    Buraco buraco;
    private String equipamento;
    private Float horasTrabalhadas;
    private Float qtidadeMaterial;
    private String status;
    private Float custos;*/

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getNumeroEquipe() {
        return numeroEquipe;
    }

    public void setNumeroEquipe(int numeroEquipe) {
        this.numeroEquipe = numeroEquipe;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public Float getHora() {
        return hora;
    }

    public void setHora(Float hora) {
        this.hora = hora;
    }

    public String getEstadoDoBuraco() {
        return estadoDoBuraco;
    }

    public void setEstadoDoBuraco(String estadoDoBuraco) {
        this.estadoDoBuraco = estadoDoBuraco;
    }

    public Float getQtidadeMaterial() {
        return qtidadeMaterial;
    }

    public void setQtidadeMaterial(Float qtidadeMaterial) {
        this.qtidadeMaterial = qtidadeMaterial;
    }

    public Float getCustos() {
        return custos;
    }

    public Float setCustos(Float custoMaterial,Float custoHoraPessoa) {
        this.custos = this.getQtidadeMaterial()*custoMaterial+this.getHora()*this.getNumeroPessoas()*custoHoraPessoa;
        return custos;
    }
    
    
}
