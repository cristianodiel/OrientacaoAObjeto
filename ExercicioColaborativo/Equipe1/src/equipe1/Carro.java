/*Às vésperas da final da copa pistão, nosso piloto Marquinho Katchau precisa da sua ajuda, criando 1 classe carro e 3 métodos: 
1 - acelerar() que deve somar 5 Km/h a sua velocidade atual;
2 - katchau() que deve somar 25 Km/h a sua velocidade atual;
3 - frear() que deve subtrair 10 Km/h da sua velocidade atual.
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipe1;

/**
 *
 * @author CristianoLuizDiel
 */
public class Carro {
    private String modelo;
    private String ano;
    public Float velocidade;
    
    /*public Carro (String modelo, String ano){
        this.modelo = modelo;
        this.ano = ano;
    }*/

//método de set
    public void acelerar(){
        this.velocidade = this.velocidade + 5.0f;
    }

    public void katchau(){
        this.velocidade = this.velocidade + 25.0f;
    }
    
    public void frear(){
        this.velocidade = this.velocidade - 10.0f;
    }
    
    
}