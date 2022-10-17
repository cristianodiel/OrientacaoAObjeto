/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula22_10_14;

/**
 *
 * @author CristianoLuizDiel
 */
public class Conta {
    //atributos
    private int numero = 0;
    private double saldo = 0;
    private Cliente correntista = new Cliente();
    
    //métodos

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setCliente(String nome, String tipo) {
        correntista.setNome(nome);
        correntista.setTipo(tipo);
    }
    public String getCliente(){
        String saida = "nome: " + correntista.getNome() + "\n";
        saida += "Saldo: " + numero + "\n";
        saida += "Numero conta: " + numero + "";
        
        return saida;
    }
    public void Depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
        }
    }
    public void Saque(double valor){
        int taxa = 5;
        if(saldo - (valor + taxa) >= 0){
            saldo = saldo - (valor + taxa);
        }
    }
    
    



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }     
    public double getSaldo() {
        return saldo;
    }

   

    
    
}
