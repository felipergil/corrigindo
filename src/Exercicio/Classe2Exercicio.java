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
public class Classe2Exercicio {

    void Exercicio(double Y, double Z, double H) {

        /* CRIE UM CÓDIGO QUE EXECUTE A SEGUINTE FUNÇÃO MATEMÁRICA:
        
        X = ((Y^2 + ((47 * Z) / 145)) * H) + Y
        
        APÓS O CÁLCULO SE O VALOR DE X FOR MAIOR DO QUE 40 O PROGRAMA DEVE IMPRIMIR 5 LINHAS DISTINTAS COM A FRASE 'ERRADO!!' CASO CONTRÁRIO IMPRIMA O RESULTADO DE X.      
        
        Casos de teste:
        
        Y=5, Z=5, H=1 (Resultado: 31,62)
        Y=5, Z=5, H=2 (Resultado: ERRADO!) 
        
         */
        double yElevado = Math.pow(Y, 2);
        double valorCalculado = yElevado + (47 * Z) / 145;
        double novoValorCalculado = (valorCalculado * H) + Y;

        if (novoValorCalculado > 40) {
            int x = 1;
            while (x < 6) {
                System.out.println("ERRADO!!");
                x++;
            }
        } else {
            System.out.println(String.valueOf(novoValorCalculado));
        }

    }

}
