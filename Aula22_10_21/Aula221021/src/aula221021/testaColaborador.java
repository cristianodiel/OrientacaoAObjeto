package aula221021;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CristianoLuizDiel
 */
public class testaColaborador {
    
}
public class Colaborador{
    private String cargo;
    private Colaborador supervisor;
    
    public COlaborador(){
    }
         
    public Colaborador (String cargo){
        this.cargo = cargo;
        this.supervisor = new Colaborador();
    }
}