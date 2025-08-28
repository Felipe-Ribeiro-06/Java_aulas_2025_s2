/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionarios;

/**
 *
 * @author fehri
 */
public class testaFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           funcionarios F1 = new funcionarios();
        
        F1.nomeFuncionario ="Felipe";
        F1.salarioFuncionario = 1518;
        
        F1.aumentaSalario(F1.salarioFuncionario);
        F1.infosFuncionarios(F1.nomeFuncionario, F1.salarioFuncionario);
        F1.valorAumento(F1.salarioFuncionario);
        
        System.out.println("O valor do aumento foi de " + F1.salarioAtualizado);
        System.out.println("----------------------------");
        
        funcionarios F2 = new funcionarios();
        
        F2.nomeFuncionario ="LUANA";
        F2.salarioFuncionario = 1918;
        
        F2.aumentaSalario(F2.salarioFuncionario);
        F2.infosFuncionarios(F2.nomeFuncionario, F2.salarioFuncionario);
        F2.valorAumento(F2.salarioFuncionario);
        
        System.out.println("O valor com auemnto é de " + F2.salarioAtualizado);
        System.out.println("----------------------------");
    }
    
 }
    
