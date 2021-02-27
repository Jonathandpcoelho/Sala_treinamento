package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

import Connectors.conexao;

import javax.swing.JInternalFrame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Tela_cadastro extends JFrame {

	private static final String JFrame = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	//iniciar aplicação!!
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cadastro frame = new Tela_cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela_cadastro() {
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setFont(new Font("Dialog", Font.BOLD, 25));
		setTitle("Cadastro Do Aluno");
		setDefaultCloseOperation(JFrame,"EXIT_ON_CLOSE");
		setBounds(100, 100, 478, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite seu nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(22, 24, 170, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite Seu Sobrenome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(22, 80, 141, 52);
		contentPane.add(lblNewLabel_1);
		
		Button button = new Button("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//Ação para o botao "OK" do menu de cadastro do aluno...
				
				
				
				try {
					Connection 
					con = conexao.Faz_conexao();
					
					String sql = "select *from dados_pessoas where nome=? and sobrenome=?";
					
					PreparedStatement stm = con.prepareStatement(sql);
					
					JLabel tfnome = null;
					stm.setString(1, tfnome.getText());
					JLabel tfsobrenome = null;
					stm.setString(2,tfsobrenome.getText());
					
					
					ResultSet rs = stm.executeQuery();
					
					if (rs.next()) {
						
						JOptionPane.showMessageDialog(null, "Pessoa cadastrada!");
						
					}else {
						
						JOptionPane.showMessageDialog(null, "Pessoa não Cadastrada");
						
						stm.close();
						con.close();
						
					}
					
					
					
					
				} catch (SQLException e1) {
			
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		button.setBounds(173, 162, 118, 21);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(195, 39, 159, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 96, 158, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

	private void setDefaultCloseOperation(String jframe2, String string) {
		
		
	}
}
