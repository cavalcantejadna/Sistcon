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
public enum EnumTipoEspaco {
    
    CHURRASQUEIRA("churrasqueira"),
    QUADRA("quadra"),
    SALAO_FESTA("salao_festa");

    private String value;
	
	EnumTipoEspaco(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
