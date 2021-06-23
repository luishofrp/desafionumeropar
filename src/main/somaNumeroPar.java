package main;
import java.util.Scanner;

public class somaNumeroPar {
	
	public	static	void main(String[] args) {
		
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Informe uma sequencia de numeros para serem calculados: ");
			String n = ler.nextLine();
			String[] numero = n.split("\\s+");
			int soma = 0;
			for (String i : numero) {
				
				int cont = Integer.parseInt(i);
			    	
				if (cont%2 ==0) {
					soma = soma + cont;
					cont++;
							
				}
				
			}

			System.out.println("Soma dos Numeros Pares:" +soma);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
		
}


