package estagioAtv5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    String string;
	    String reverso = "";
	    
	    Scanner src= new Scanner(System.in);
	    
	    System.out.println("Digite a parava que voce deseja reverter.");
	    string = src.nextLine();

	    // Usando for each o string sera quebrado em um array que sera usado para criar uma nova palavra
	    for (char caractere : string.toCharArray()) {
	    	reverso = caractere + reverso;
	    }
	    
	    System.out.println(reverso);

	}

}
