/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula22.pkg10.pkg11;//pacote onde está a classe

/**
 *
 * @author CristianoLuizDiel
 */
public class Pessoa {
    //atributos privados
    //características
    private String nome;
    private String email;
    public String cpf;

    
    //métodos de acesso setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //método de acesso do tipo getter

    public String getNome() {
        return this.nome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    
//método void não tem retorno
    public void digaOi(){
        System.out.println("oi");
        System.out.println("oi de novo");
    }
    
    //método com tipo tem que ter um retorno, 
    //e o retorno tem que ser condizente com o tipo do método.
    public String digaTchau(){
        return "tchau";
    }
}
