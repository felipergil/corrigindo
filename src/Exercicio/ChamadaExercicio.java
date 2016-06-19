/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

/**
 *
 * @author Felipe Rodrigues Gil RA 248542
 * @autor Thiago de Godoy Sanches RA: 250821
 */
public class ChamadaExercicio {

    public static void main(String[] args) {
        System.out.println("Enunciado do Exercício: Jogo dos 4 erros e 1 desenvolvimento");
        System.out.println("(Obs. As respostas para o exercício devem ser inseridas neste código para impressão em tela)");
        System.out.println("");
        System.out.println("RESPOSTA: 1. Exercício: O código abaixo deveria imprimir 6 linhas, mas esta imprimindo 7. Corrija o erro e responda o que foi feito abaixo");

        Classe1Exercicio Exercicio = new Classe1Exercicio();
        Exercicio.Exercicio1();

        System.out.println("alterei o for que estava setado para rodar 6 vezes,alterei para 5>");

        System.out.println("");
        System.out.println("RESPOSTA: 2. Exercício: O código abaixo deveria imprimir a frase 'Próxima linha' após cada impressão. Corrija o erro e responsa o que foi feito abaixo");

        Exercicio.Exercicio2();

        System.out.println("Exclui a segunda linha do código e inseri a palavra próxima linha no mesmo system.out");

        System.out.println("");
        System.out.println("3. Exercício: Porque o código abaixo duas sequencias que somam 5 imprimem resultados diferente. Corrija o erro e responsa o que foi feito abaixo");

        System.out.println(Exercicio.Exercicio3(2, 1, 1, 1, 1));
        System.out.println(Exercicio.Exercicio3(2, 1, 1, 1, 1));

        System.out.println("RESPOSTA: A estrutura de colchetes estavam posicionadas de forma errada.");

        System.out.println("");
        System.out.println("4. Exercício: Porque o código não imprime a frase. Corrija o erro e responsa o que foi feito abaixo");

        Exercicio.Exercicio4();

        System.out.println("RESPOSTA: Após a primeira rodada do while, atribui o valor 0 para a variavel");

        System.out.println("");
        System.out.println("5. Exercício: Altere o código da classe 'Classe2Exercicio' de acordo com o enunciado");

        Classe2Exercicio ExercicioDesenvolvimento = new Classe2Exercicio();
        ExercicioDesenvolvimento.Exercicio(5, 5, 1);

        System.out.println("RESPOSTA: USAMOS A LÓGICA MATEMÁTICA JUNTAMENTE COM FUNDAMENTO DE IF, ELSE E WHILE");
    }
}
