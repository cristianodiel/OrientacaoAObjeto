/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eletronicos;

/**
 *
 * @author CristianoLuizDiel
 */
//extends: Computador é classe filha de Eletronico
public class Computador extends Eletronico{
    //computador é um eletrônico com todos os seus atributos
    //e métodos.
    //e se acrescentam atributos que são caracteriísticos
    //de computador.
    private String processador;
    private int memoria;
    private String placaDeVideo;
    //inserir construtores
    //botao direito do mouse > insert code
    //construtor - escolhe quais atributos usar no construtor
    
    //inserir métodos de acesso
    //botao direito do mouse
    //insert code
    //getter and setter
    
    public void trocarMemoria(int memoria){
        this.memoria = this.memoria + memoria;
    }
}
