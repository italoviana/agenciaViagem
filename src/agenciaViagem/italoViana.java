package agenciaViagem;

import java.util.ArrayList;
import java.util.Scanner;


public class italoViana {

	public static void main(String[] args) {
		
		ArrayList<Passagem> lista = new ArrayList();
		
		Passagem usuario01 = new Passagem();
		Passagem usuario02 = new Passagem();
		Passagem usuario03 = new Passagem();
		Passagem usuario04 = new Passagem();
		
		usuario01.cadastrar("Jennifer Cruz", 100.0, 2.4, "Madureira");
		usuario02.cadastrar("Karina Simões", 200.0, 2.4, "Rio de Janeiro");
		usuario03.cadastrar("Wanessa Alves", 300.0, 2.4, "Bahia");
		usuario04.cadastrar("Brenda Vialle", 300.0, 2.4, "Angra dos Reis");
		
		lista.add(usuario01);
		lista.add(usuario02);
		lista.add(usuario03);
		lista.add(usuario04);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));	
		}
		}

	}
