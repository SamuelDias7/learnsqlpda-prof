package br.com.learnsqlpda.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;//gerenciador de layout - organizar componentes.
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class ComandoGUI extends JFrame {
  
	/*
	 *Pilares: Componentes (Swing) Eventos (Awt)
	 *  *JLabel (lblTipo, lblAluno,lblTarefa,lblResultado
        *JTextField (txtTipo,txtAluno)
        *JTextArea (txaTarefa,txaResultado)
        *JButton (btnCadastrar)
	 * 
	 * 1º Pilar : Componentes
	 * 2º Pilar : Propriedades
	 * 3º Pilar : Eventos
	 */
	//declarei meus componentes.
	 private JLabel lblTipo, lblAluno,lblTarefa,lblResultado,lblTotal;
	 private JTextField txtTipo,txtAluno;
	 private JTextArea txaTarefa,txaResultado;
	 private JButton btnCadastrar;
	 
	 //instanciar os componentes no construtor.
	 public ComandoGUI() {
		 //instânciei cada JLabel e passei para o construtor um texto(título)
		 lblTipo = new JLabel("Tipo");
		 lblAluno = new JLabel("Aluno");
		 //lblTarefa = new JLabel("Tarefa");
		 //lblResultado = new JLabel("Resultado/Produto");
		 // Obtém a data atual e define o texto do JLabel
	     LocalDate dataAtual = LocalDate.now();
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dataFormatada = dataAtual.format(formatter);
	       
		 lblTotal = new JLabel(dataFormatada);
		 
		 //Vamos trabalhar agora nas caixas de texto
		 txtTipo = new JTextField(30);
		 txtAluno = new JTextField(30);
		 
		 //Vamos trabalhar agora nas caixas de textos grandes.
		 txaTarefa = new JTextArea(40,70);
		 txaResultado = new JTextArea(40,70);
	
		 
		 //Vamos agora programar o botão.
		 
		 btnCadastrar = new JButton("Cadastrar");
		 
		 //escolher um gerenciador de layout
		// getContentPane().setLayout(new FlowLayout());//linha
		 
		  getContentPane().setLayout(new BorderLayout());
		 
		 //2º Pilar - propriedades
		  setSize(1500,600);
		 //Deixar o negócio bonito amanhã
		 //GridLayout e BorderLayout - Paineis.
		 
		 //Ha!Vou deixar bonito logo agora hehe
		 //Vou comentar aquele FlowLayout( )
		 //Agora vou usar o GridLayout.
		 //O GridLayout vai fazer uma tabela no visual
		 
		 /*
		  * Tá! Vamos pensar juntos se eu vou tirar o FlowLayout
		  * Que tal então pensar na tabela agora
		  * Vai ter uma tabela de 
		  * 
		  * Tipo <     >
		  * Aluno <     >
		  * Tarefa <    >
		  * Resultado <   >
		  * Botão   <total comandos>
		  * Que tal criarmos então: 5 linhas e 2 colunas
		  * 
		  * 
		  * 
		  */
		 
		   //vou tentar melhorar usando paineis vamos ver
		  JPanel painel1,painel2,painel3,painel4,painel5;
		  painel1 = new JPanel();
		  painel2 = new JPanel();
		  painel3 = new JPanel();
		  painel4 = new JPanel();
		  painel5 = new JPanel();
		  
          
		  //painel 1
		  painel1.add(lblTipo);
		  painel1.add(txtTipo);
		  
		  //painel 1
		  painel1.add(lblAluno);
		  painel1.add(txtAluno);
		  painel1.setLayout(new FlowLayout());
		  
		  //painel 3
		 // painel3.add(lblTarefa);
		  txaTarefa.setText("Informações da Tarefa:");
		  JScrollPane scrollPane1 = new JScrollPane(txaTarefa);
		  
		  painel3.add(scrollPane1);
		 
		  
		  //painel 4
		 // painel4.add(lblResultado);
		  txaResultado.setText("Informações do Resultado:");
		  JScrollPane scrollPane2 = new JScrollPane(txaResultado);
		  painel4.add(scrollPane2);
		 
		  
		  //painel 1
		  painel1.add(btnCadastrar);
		  painel1.setLayout(new FlowLayout());
		  
		  //painel 2 - barra de status
		  painel2.add(lblTotal);
		  
		  getContentPane().add(painel1,BorderLayout.NORTH);
		  getContentPane().add(painel4,BorderLayout.EAST);
		  getContentPane().add(painel3,BorderLayout.WEST);
		  getContentPane().add(painel2,BorderLayout.SOUTH);
		  
	
		
		  /*
		   * É galera mesmo com o gridlayout não ficou legal
		   * que tal a gente reorganizar usando outros gerenciadores
		   * 
		   * 
		   */
           setResizable(false);
		
			 
		
		  
		 
		 
	 }
	 
	
}
