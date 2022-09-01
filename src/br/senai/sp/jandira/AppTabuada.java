package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Multiplicacao;

public class AppTabuada {
	
	public static void main(String[] args) {
		Multiplicacao m = new Multiplicacao();
		
		m.multiplicando = 4;
		m.minMultiplicador = 1;
		m.maxMultiplicador = 9;
		
		m.getTabuada();
		
	}
	
}
