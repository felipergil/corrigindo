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
class NomesInvertidos {
    
    private String NomePessoa1, NomePessoa2, NomePessoa3;
    private String ResultadoNomesInvertidos;
 
    NomesInvertidos (String Nome1,String Nome2,String Nome3){
        this.NomePessoa1 = Nome1;
        this.NomePessoa2 = Nome2;
        this.NomePessoa3 = Nome3;
        
        ResultadoNomesInvertidos = "";
    }
    
    String Inversao ()
    {
        ResultadoNomesInvertidos = NomePessoa3 + " " + NomePessoa2 + 
                " " + NomePessoa1;
        
        return ResultadoNomesInvertidos;
    }
}
