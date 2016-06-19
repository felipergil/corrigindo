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
public class JavaIntroducaoProgramacao {

    public static void main(String[] args) {
        
        System.out.println("Execução do 1° exercício:");
        
        NomesInvertidos ExecucaoNomesInvertidos = new NomesInvertidos("Armando", "Felipe", "Araujo");
        System.out.println(" Exemplo nomes 1: " + ExecucaoNomesInvertidos.Inversao());
        
        ExecucaoNomesInvertidos = new NomesInvertidos("Michele", "Roger", "Marcela");
        System.out.println(" Exemplo nomes 2: " + ExecucaoNomesInvertidos.Inversao());
        
        System.out.println("");
        
        System.out.println("Execução do 2° exercício:");
        
        NovoSalario ExecucaoCalculoNovoSalario = new NovoSalario("Julio",2000.45, 10);
        System.out.println(" O funcionário(a) " + ExecucaoCalculoNovoSalario.NomeFuncionario() + " ganha R$" + String.valueOf(ExecucaoCalculoNovoSalario.SalarioFinal()));
        
        ExecucaoCalculoNovoSalario = new NovoSalario("Michele",7850, 40);
        System.out.println(" O funcionário(a) " + ExecucaoCalculoNovoSalario.NomeFuncionario() + " ganha R$" + String.valueOf(ExecucaoCalculoNovoSalario.SalarioFinal()));
    }
    
}
