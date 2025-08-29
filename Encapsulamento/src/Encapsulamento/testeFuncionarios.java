/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamento;


public class testeFuncionarios {
    public static void main(String[] args) {
       funcionarios F = new funcionarios ();
       
       F.setNome("Felipe");
       F.setSalario(1250);
       F.setAumento(30);
       
        System.out.println(F.getNome());
        System.out.println(F.getSalario());
        System.out.println(F.getAumento());
    }
    

 
}
