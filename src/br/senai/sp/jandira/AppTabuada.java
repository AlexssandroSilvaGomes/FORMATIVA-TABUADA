package br.senai.sp.jandira;

import javax.swing.JFrame;

import br.senai.sp.jandira.model.Multiplicacao;

public class AppTabuada {
	
	public static void main(String[] args) {
		Multiplicacao m = new Multiplicacao();
		
		m.multiplicando = 4;
		m.minMultiplicador = 1;
		m.maxMultiplicador = 9;
		
		String[] res = m.getTabuada();
		
		int i = 0;
		
		while (i < res.length) {
			System.out.println(res[i]);
			i++;
		}
		
//		JFrame janela = new JFrame();
//		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
//		janela.setSize(500, 500);
//		janela.setVisible(true);
//		
	}
	
}
