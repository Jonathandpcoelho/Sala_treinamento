package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connectors.conexao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Consulta extends JFrame import {

	private JPanel contentPane;
	private JTextField textField;

	// metodo pra tela!
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Consulta() {
		setTitle("Consulta Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o Primeiro nome para consultar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 283, 90);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(288, 38, 219, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setBounds(357, 106, 85, 21);
		contentPane.add(btnNewButton);
		
		
	}

		
		public void actionPerformed(ActionEvent e) {
			
			//Ação para o botao "OK" do menu de cadastro do aluno...
							
							
							
							try {
								Connection 
								con = conexao.Faz_conexao();
								
								String sql = "select *from dados_pessoas where nome=? and sobrenome=?";
								
								PreparedStatement stm = con.prepareStatement(sql);
								
								JLabel tfnome = null;
								
								//id é pra ser a pocição na sala qual sala;
								
								int id;
								stm.setString(1, tfnome.getText());
								JLabel tfsobrenome = null;
								stm.setString(2,tfsobrenome.getText());
								
								
								ResultSet rs = stm.executeQuery();
								
								if (rs.next()) {
									
									JOptionPane.showMessageDialog(null, "Pessoa cadastrada!" +id);
									
								}else {
									
									JOptionPane.showMessageDialog(null, "Pessoa não Cadastrada");
									
									stm.close();
									con.close();
									
								}
							
		
		
	

