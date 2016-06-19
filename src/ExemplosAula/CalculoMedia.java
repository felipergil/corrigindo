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
public class CalculoMedia {
    
    private int Nota1Trimestre, Nota2Trimestre, Nota3Trimestre, Nota4Trimestre;
    private int Media;
    
    CalculoMedia(int Nota1,int Nota2,int Nota3,int Nota4){
        this.Nota1Trimestre = Nota1;
        this.Nota2Trimestre = Nota2;
        this.Nota3Trimestre = Nota3;
        this.Nota4Trimestre = Nota4;
        
        this.Media = 0;
    }      
    
    int ResultadoMedia()
    {
        Media = (Nota1Trimestre + Nota2Trimestre + Nota3Trimestre + Nota4Trimestre) / 4;
        return Media;
    }
}
