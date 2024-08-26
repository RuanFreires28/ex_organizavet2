package view;

import br.edu.fateczl.calc.bubble.operations;

public class MainBubble 
{
	
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {44, 43, 42, 41, 40, 39, 38};
		
		vet = c.bublesort(vet);
		
		int cont = 1;
		
		for (int i:vet)
		{
			if (cont == (vet.length))
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i + ", ");
				cont++;
			}
		}	
	}
}
