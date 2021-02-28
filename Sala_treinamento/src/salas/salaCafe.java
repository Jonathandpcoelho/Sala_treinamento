package salas;

import java.util.Scanner;

import pessoa_nome_sobrenome.Pessoa;

public class salaCafe extends Pessoa {
	
	
	public static void main(String[] args) {
	


	Scanner Nome = new Scanner(System.in);
	
	
	         System.out.println("digite o nome a ser cadastrado na sala de café:   ");
	         
	         //id vem da classe pessoa que é para ser a variavel q armazena os alunos;
	        
           id = Nome.nextInt();
            
	
	
	
	if ((id>= 15)) 
	         System.out.printf("sala de café lotada, maximo sao 15 pessoas e existe: " + id);

    else     System.out.printf("ainda existe espaço para mais alunos na sala de café quantidade maxima da sala é 15, e temos "+id);

	}

	

}
