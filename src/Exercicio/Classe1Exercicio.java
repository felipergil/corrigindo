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
public class Classe1Exercicio {

    void Exercicio1() {
        /* IMPRIMA 6 LINHAS COM O NÚMERO DE CADA UMA DELAS*/

        for (int x = 0; x <= 5; x++) {
            System.out.println("Linha " + String.valueOf(x));
        }
    }

    void Exercicio2() {
        /* IMPRIMA 6 LINHAS COM O NÚMERO DE CADA UMA DELAS E APÓS CADA LINHA IMPRIMA A FRASE 'PRÓXIMA LINHA'*/

        for (int x = 0; x <= 6; x++) {
            System.out.println("Linha " + String.valueOf(x) + " Próxima linha");
        }

    }

    String Exercicio3(int Numero1, int Numero2, int Numero3, int Numero4, int Numero5) {
        /* CALCULE A SOMA DE 5 NÚMEROS SE A SOMA DER MAIOR OU IGUAL A 5 IMPRIMA A FRASE 'CORRETO' SE FOR MENOS QUE 5 IMPRIMA A FRASE 'INCORRETO'*/
        int Numero = 0;

        Numero = Numero1 + Numero2 + Numero + Numero4 + Numero5;

        if (Numero >= 5) {
            return "Correto";
        } else {
            return "Incorreto";
        }
    }

    void Exercicio4() {
        /* IMPRIMA UMA LINHA DENTRO DA CONDIÇÃO ENQUANTO COM A FRASE 'IMPRIME REPETIÇÃO'*/

        int x = 1;

        while (x == 1) {
            System.out.println("Imprime Repetição");
            x = 0;
        }

    }
}
