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
public class CalculoMediaAlunos {
    private String[] NomeAlunos = new String[5];
    private int[][] NotasAlunos = new int[5][4];
    
    
    CalculoMediaAlunos(String[] Alunos, int[][] Notas){
        this.NomeAlunos = Alunos;
        this.NotasAlunos = Notas;
    }
    
    void AlunosAprovados(){
        
        for(int x = 0; x < NomeAlunos.length; x++ ){
            
            int MediaAluno = 0;
            CalculoMedia Media = new 
                CalculoMedia(NotasAlunos[x][0],NotasAlunos[x][1],
                        NotasAlunos[x][2],NotasAlunos[x][3]);
            
            MediaAluno = Media.ResultadoMedia();
            
            System.out.println("O aluno " + NomeAlunos[x] + " teve média " + 
                    String.valueOf(MediaAluno) );
        }
    }            
}
