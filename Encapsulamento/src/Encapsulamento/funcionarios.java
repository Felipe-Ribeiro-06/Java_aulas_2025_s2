/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamento;

/**
 *
 * @author fehri
 */
public class funcionarios {
    private String nome ;
    private double salario;
    private double salarioAtt;
    
    public  void setAumento (double aumento){
        this.salarioAtt = this.salario + ((this.salario * aumento)/100) ;
        //if(this.salario <= 1518){
         //   this.salario += this.salario * 0.2;
    }

    
    public double getAumento (){
        return salarioAtt;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
