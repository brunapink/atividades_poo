//Grupo 1: Leví Melo, Luiz Gustavo Pereira, Bruna Rosa Rodrigues e Miguel Bragança

package pokedex;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	//Array contendo os pokemons
	static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	
    public static void main(String[] args) throws IOException {  	
    	//Leitor do arquivo que contem todos os pokemons e seus atributos
    	BufferedReader br = null;
    	br = new BufferedReader(new FileReader("C:/Users/bruna/OneDrive/Documentos/UCB/POO/Trabalho/listaPokemons.txt"));
     
        //Iniciando os pokemons no array         
        String linha; 
        int i = 0;
        while((linha = br.readLine()) != null){
            Pokemon p1 = new Pokemon();
            
            p1.setNome(linha);         
            linha = br.readLine();
            p1.setDescricao(linha);
            linha = br.readLine();
            p1.setTipo(linha);
            linha = br.readLine();
            p1.setEvolucao(linha);
            
            pokemons.add(i,p1);
            i++;
        }
       
        br.close();       
        menu();       
    }

    public static void OpcoesMenu(){
        System.out.println("\n\n|------------ POKEDEX ------------|");
        System.out.println("|              MENU               |");
        System.out.println("|                                 |");
        System.out.println("|       1- Capturar Pokemon       |");
        System.out.println("|       2- Ver Pokedex            |");
        System.out.println("|       3- Ver seus Pokemons      |");
        System.out.println("|       4- Sair                   |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
    }
    
    public static void menu() { 
    	Scanner scan = new Scanner(System.in);    	
    	int escolha;
    	   	
        do {

            OpcoesMenu();
            escolha = scan.nextInt();
            switch(escolha){               
                case 1:    //capturar pokemon 
                    CapturarPokemon(pokemons);
                    break;
                 
                case 2:   //ver sua pokedex
                    Pokedex.imprimePokemon(pokemons);
                    break;
                 
                case 3:   //ver meus pokemons 
                    VerPokemons(pokemons);
                    break;
                    
                case 4:	 //sair
                    System.out.println("Pokedex is closed.");
                    break;

                default:     
                    System.out.println("Opcao invalida, tente novamente...");
            }            

        }while(escolha != 4);
                
        scan.close();      
    }
      
    public static void CapturarPokemon(ArrayList<Pokemon> pokemons) {
		Random numero = new Random();
		
		int capturar = numero.nextInt(10);		
		Pokemon capturado = pokemons.get(capturar);
		
		if (capturado.getCapturado() == true) {
			System.out.println("O " + pokemons.get(capturar).getNome() + " fugiu... Você não conseguiu capturar! :c");
		}
		
		if (capturado.getCapturado() == false) {
			pokemons.set(capturar, capturado);
			capturado.setCapturado(true);
			System.out.println("Você capturou o " + pokemons.get(capturar).getNome() + "!!");
			
		}	
	}
    
	public static void VerPokemons(ArrayList<Pokemon> pokemons) {
		int contador = 0;
		
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("|                    POKEMONS CAPTURADOS                    |");
		System.out.println("+-----------------------------------------------------------+");
		
		for (int i = 0; i < 10; i++) {
			Pokemon capturado = pokemons.get(i);
			
			if (capturado.getCapturado() == true) {
				System.out.println("|Nome: "+ pokemons.get(i).getNome() +" | Tipo: "+ pokemons.get(i).getTipo() +" | Evolução: "+ pokemons.get(i).getEvolucao());
				contador++;
			} 
		}
		System.out.println("+-----------------------------------------------------------+");
		
		if (contador < 10) {
			System.out.println("\n\n");
			System.out.println("+-----------------------------------------------------------+");
			System.out.println("|                    POKEMONS NÃO CAPTURADOS                |");
			System.out.println("+-----------------------------------------------------------+");			
			
			for (int i = 0; i < 10; i++) {
				Pokemon capturado = pokemons.get(i);
				
				if (capturado.getCapturado() == false) {
					System.out.println(pokemons.get(i).getNome());
				}
			}
			System.out.println("+-----------------------------------------------------------+");
		}
	}
}