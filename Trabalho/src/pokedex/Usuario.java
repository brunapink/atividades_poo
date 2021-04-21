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
	
    public static void main(String[] args, ArrayList<Pokemon> pokemons) throws IOException {
    	//Leitor do arquivo que contem todos os pokemons e seus atributos
    	BufferedReader br = null;
    	br = new BufferedReader(new FileReader("C:/Users/bruna/OneDrive/Documentos/UCB/POO/src/pokedex/listaPokemons.txt"));
     
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

    public static void menu() { 
    	Scanner scan = new Scanner(System.in);    	
    	int escolha;
    	   	
	    System.out.println("|---------- POKEDEX ----------|");
	    System.out.println("|            MENU             |");
	    System.out.println("|                             |");
	    System.out.println("|     1- Capturar pokemon     |");
	    System.out.println("|     2- Treinar pokemon      |");
	    System.out.println("|     3- Ver pokemons         |");
	    System.out.println("|     4- Sair                 |");
	    System.out.println("|                             |");
	    System.out.println("|-----------------------------|");
	    
        do {
            escolha = scan.nextInt();
            switch(escolha){               
                case 1:    //capturar pokemon 
                    CapturarPokemon(pokemons);
                 break;
                 
                case 2:   //informações pokemon 
                    System.out.println("case 2");
                 break;  
                 
                case 3:   //ver meus pokemons 
                    System.out.println("case 3");
                    break;
                    
                case 4:	 //sair
                    System.out.println("Pokedex is closed.");
                    break;

                default:     
                    escolha = 0;
                }            
        }while(escolha != 4);
                
        scan.close();      
    }
    
    public static void CapturarPokemon(ArrayList<Pokemon> pokemons) {
		Random numero = new Random();
		
		int capturar = numero.nextInt(9);		
		Pokemon capturado = pokemons.get(capturar);
		
		if (capturado.getCapturado() == true) {
			System.out.println("Você já tem esse Pokemon! :D");
		}
		
		if (capturado.getCapturado() == false) {
			capturado.setCapturado(true);
			pokemons.set(capturar, capturado);
			System.out.println("Pokemon capturado!!");
		}
	}
}