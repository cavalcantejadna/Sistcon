/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumExemplo;

/**
 *
 * @author Jadna Cavalcante
 */
public enum EnumStatusEspaco {
    
    RESERVADO("Reservado"),
    DISPONIVEL("Disponivel");
    
    private String tipo;
    
    EnumStatusEspaco(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
}
