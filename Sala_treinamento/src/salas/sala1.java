package salas;

import java.util.Scanner;

public class sala1 {

	private static int qntMax;

	public int getQntMax() {
		return qntMax;
	}

	public void setQntMax(int qntMax) {
		this.qntMax = qntMax;
	}
	


//metodo main para ter uma lotação nesta sala;
	
	public static void main(String[] args) {

	
		Scanner qntExist = new Scanner(System.in);
		System.out.println("digite quantas pessoas deseja adicionar nesta sala:  " );
	
		qntMax = qntExist.nextInt();
	  
	    if ((qntMax >= 12)) 
	    	     System.out.printf("sala lotada, maximo sao 12 pessoas e existe: " + qntMax);
	    
	    else     System.out.printf("ainda existe espaço para mais alunos quantidade maxima da sala é 12, e temos "+qntMax);
	   

	
	    
		

	}

		
		
	
		
	


	

}
