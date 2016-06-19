/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemplosAula;

/**
 *
 * @author Caio Felix
 */
public class ExemplosAula {
    
    public static void main(String[] args) {
        String[] NomeAlunos = new String[5];
        int[][] NotasAlunos = new int[5][4];
        
        NomeAlunos[0] = "Heitor";
        NotasAlunos[0][0] = 7;
        NotasAlunos[0][1] = 5;
        NotasAlunos[0][2] = 3;
        NotasAlunos[0][3] = 6;
        
        NomeAlunos[1] = "Leonardo";
        NotasAlunos[1][0] = 7;
        NotasAlunos[1][1] = 2;
        NotasAlunos[1][2] = 1;
        NotasAlunos[1][3] = 0;
        
        NomeAlunos[2] = "Gilberto";
        NotasAlunos[2][0] = 10;
        NotasAlunos[2][1] = 9;
        NotasAlunos[2][2] = 8;
        NotasAlunos[2][3] = 3;
        
        NomeAlunos[3] = "Thiago";
        NotasAlunos[3][0] = 2;
        NotasAlunos[3][1] = 1;
        NotasAlunos[3][2] = 1;
        NotasAlunos[3][3] = 5;
        
        NomeAlunos[4] = "Amanda";
        NotasAlunos[4][0] = 5;
        NotasAlunos[4][1] = 7;
        NotasAlunos[4][2] = 8;
        NotasAlunos[4][3] = 7;
        
        CalculoMediaAlunos CalcularMedias = new CalculoMediaAlunos(NomeAlunos, NotasAlunos);
        
        CalcularMedias.AlunosAprovados();
    }
}
