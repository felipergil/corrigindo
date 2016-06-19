/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroducaoprogramacao;

/**
 *
 * @author Caio Felix
 */
public class NovoSalario {
    
    private String NomeFuncionario;
    private double SalarioAtual;
    private double PercentualReajuste;
    
    private double SalarioFinal;
    
    NovoSalario(String Funcionario, double Salario, double Reajuste){
        this.NomeFuncionario = Funcionario;
        this.SalarioAtual = Salario;
        this.PercentualReajuste = Reajuste;
        
        SalarioFinal = 0;
    }
    
    double SalarioFinal(){
         
        SalarioFinal = SalarioAtual + (SalarioAtual * (PercentualReajuste/100));
        
        return SalarioFinal;
    }
    
    String NomeFuncionario(){
        return NomeFuncionario;
    }
}
