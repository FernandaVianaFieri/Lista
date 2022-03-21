package br.com.oz2;



	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;

	
	public class Lista {
		public static void main (String []args) {
			
			
			// usando ArrayList
			ArrayList<String> lista = new ArrayList<>();
			
			
			
			// Boa paratica pede para declarar o tipo como List
			
			//Interface List implementa tanto ArrayList quanto Linked List
			List <String> lista2 = new ArrayList <>();
							
			List <String>lista3 = new LinkedList<>();
			
			
			// adicionando itens na lista
			lista.add ("Fernanda");
			lista.add("João");
			lista.add("Maria");
			lista.add("Gustavo");
			lista.add("Dilan");
			
			// recuperando o valor de cada indice usando o metodo get
			System.out.println (lista.get(0));
			System.out.println(lista.get(1));
			System.out.println(lista.get(4));
			
			System.out.println("....................................");
			
			// lista 2 >>> usando List implementando ArrayList
			
			lista2.add ("Fernanda");
			lista2.add("João");
			lista2.add("Maria");
			lista2.add("Gustavo");
			lista2.add("Dilan");
			
			
		// imprimindo toda lista>> usando o for each		
			
			for (String nome: lista2) {
				
				System.out.println(nome);
									
			}
			System.out.println("....................................");	
			
			
			// usando for each para imprimir todos os itens da lista
				lista3.add ("Fernanda");
				lista3.add("João");
				lista3.add("Maria");
				lista3.add("Gustavo");
				lista3.add("Dilan");
				
				for (String nome1: lista3) {
					System.out.println(nome1);
				}
				
				System.out.println("....................................");
				
				
				// removendo itens da lista, no caso o indice 1 >> João			
				lista3.remove(1);
				
							// usando o for para imprimir a lista já com o idice 1 que foi removido
				
				for(int i = 0; i< lista3.size();i++ ) {
					
					if(i==1)
						System.out.println("Item removido");
					else
					System.out.println(lista3.get(i));
				}
					}
			
				
	}

	