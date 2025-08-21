
package funcionarios;

public class funcionarios {
    String nomeFuncionario ;
    double salarioFuncionario;
    double salarioAtualizado ;
    double aumentoSalario ;
    
    void aumentaSalario ( double salarioFuncionario){
        this.salarioAtualizado = this.salarioFuncionario + this.salarioFuncionario * 0.1 ;
    }
    
    void  infosFuncionarios (String nomeFuncionario , double salarioFuncionario){
         System.out.println("Nome do funcionario: " + this.nomeFuncionario + " tem o salario com ajuste de " + this.salarioFuncionario);
    }
    
    
    double valorAumento (double salarioFuncionario){
        return this.salarioAtualizado - this.salarioFuncionario ; 
    }
}
