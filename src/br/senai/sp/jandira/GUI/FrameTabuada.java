package br.senai.sp.jandira.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.model.Multiplicacao;

public class FrameTabuada {
	
	public String titulo;
	public int altura;
	public int largura;
	
	public void criarTela() {
		JFrame janela = new JFrame();
		janela.setTitle(titulo);
		janela.setSize(largura, altura);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().setBackground(Color.WHITE);
		janela.setLayout(null);
		
		//pegar container para colocar componentes dentro dele
		Container painel = janela.getContentPane();
		
		//criar os componentes que serão colocados no container(tela)
		JLabel labelCalculadora = new JLabel();
		labelCalculadora.setIcon(new ImageIcon("src/br/senai/sp/jandira/img/calculadora.png"));
		labelCalculadora.setBounds(10, 10, 64, 64);
		
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setFont(new Font("Arial Black", Font.BOLD, 20));
		labelTitulo.setForeground(Color.RED);
		labelTitulo.setBounds(84, 10, 200, 30);
		
		JLabel labelDescricao = new JLabel();
		labelDescricao.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule");
		labelDescricao.setFont(new Font("", Font.PLAIN, 15));
		labelDescricao.setForeground(Color.LIGHT_GRAY);
		labelDescricao.setBounds(84, 30, 400, 30);
		
		JLabel labelDescricaoCont = new JLabel();
		labelDescricaoCont.setText("a tabuada que desejar em segundos!");
		labelDescricaoCont.setFont(new Font("", Font.PLAIN, 15));
		labelDescricaoCont.setForeground(Color.LIGHT_GRAY);
		labelDescricaoCont.setBounds(84, 45, 400, 30);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(new Font("", Font.PLAIN, 20));
		labelMultiplicando.setBounds(84, 95, 200, 30);
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMultiplicando.setFont(new Font("", Font.BOLD, 20));
		textFieldMultiplicando.setForeground(Color.BLUE);
		textFieldMultiplicando.setBorder(new LineBorder(Color.BLUE));
		textFieldMultiplicando.setBounds(210, 97, 255, 30);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador:");
		labelMinMultiplicador.setFont(new Font("", Font.PLAIN, 20));
		labelMinMultiplicador.setBounds(10, 135, 200, 30);
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMinMultiplicador.setFont(new Font("", Font.BOLD, 20));
		textFieldMinMultiplicador.setForeground(Color.BLUE);
		textFieldMinMultiplicador.setBorder(new LineBorder(Color.BLUE));
		textFieldMinMultiplicador.setBounds(210, 137, 255, 30);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador:");
		labelMaxMultiplicador.setFont(new Font("", Font.PLAIN, 20));
		labelMaxMultiplicador.setBounds(10, 175, 200, 30);
		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMaxMultiplicador.setFont(new Font("", Font.BOLD, 20));
		textFieldMaxMultiplicador.setForeground(Color.BLUE);
		textFieldMaxMultiplicador.setBorder(new LineBorder(Color.BLUE));
		textFieldMaxMultiplicador.setBounds(210, 177, 255, 30);
		
		//botões runfando
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setFont(new Font("", Font.BOLD, 20));
		buttonCalcular.setForeground(Color.WHITE);
		buttonCalcular.setBackground(new Color(11, 158, 0));
		buttonCalcular.setBorder(new LineBorder(Color.GRAY));
		buttonCalcular.setBounds(10, 237, 200, 60);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setFont(new Font("", Font.BOLD, 20));
		buttonLimpar.setForeground(Color.WHITE);
		buttonLimpar.setBackground(new Color(255, 196, 0));
		buttonLimpar.setBorder(new LineBorder(Color.GRAY));
		buttonLimpar.setBounds(220, 237, 245, 60);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(new Font("", Font.BOLD, 20));
		labelResultado.setBounds(10, 327, 200, 30);
		
		//lista
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 360, 455, 290);
		scroll.setBackground(new Color(255, 251, 0));
		JList<String> lista = new JList<>();
		lista.setForeground(new Color(11, 158, 0));
		lista.setFont(new Font("", Font.BOLD, 20));
		lista.setBackground(new Color(255, 251, 0));
		
		//colocar os componentes no container
		painel.add(labelCalculadora);
		painel.add(labelTitulo);
		painel.add(labelDescricao);
		painel.add(labelDescricaoCont);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(textFieldMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(lista);
		
		
		janela.setVisible(true);
		
		//eventos dos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Multiplicacao m = new Multiplicacao();
				m.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				m.minMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
				m.maxMultiplicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
				
				lista.setListData(m.getTabuada());
				scroll.getViewport().add(lista);
				
			}
		});
		
	}
}