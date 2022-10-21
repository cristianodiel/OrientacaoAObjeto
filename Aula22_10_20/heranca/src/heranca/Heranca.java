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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciar um Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Luke Skywalker");
        aluno.setCpf("888.888.888-88");
        aluno.setEmail("luke.skywalker@bpkedu.com.br");
        aluno.setAnoIngresso("2022");
        aluno.setEscolaridade("Ensino Médio");
        Endereco endereco = new Endereco();
        endereco.setTipoLogradouro("avenida");
        endereco.setLogradouro("Max Planck");
        aluno.setEndereco(endereco);
        
        
    }
    
}
