/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula22.pkg10.pkg11;

/**
 *
 * @author CristianoLuizDiel
 */
public class Aula221011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Fulano de Tal";
        //nao é possível acessar o atributo nome porque é privado
        pessoa.setNome("Fulano de Tal");
        System.out.println(pessoa.getNome());
        
        
        pessoa.digaOi();
        
        System.out.println(pessoa.digaTchau());
        //outra opção de chamada do método com retorno
       String tchau = pessoa.digaTchau();
       System.out.println(tchau);
    }
    
}
