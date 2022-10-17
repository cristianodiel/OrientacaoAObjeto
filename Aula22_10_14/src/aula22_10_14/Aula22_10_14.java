/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula22_10_14;

/**
 *
 * @author CristianoLuizDiel
 */
public class Aula22_10_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta minhaConta = new Conta();
        Conta usuario1 = new Conta();
        
        minhaConta.setCliente("EuMesmo", "0");
        usuario1.setCliente("usuario1", "1");
        
        minhaConta.Depositar(10);
        usuario1.Depositar(1000);
        
        System.out.println("Minha conta:");
        System.out.println(minhaConta.getCliente());
        
        System.out.println("Conta usuario1:");
        System.out.println(usuario1.getCliente());
        
        
    }
    
}
