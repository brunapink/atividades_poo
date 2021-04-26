package pokedex;

import java.util.ArrayList;

public class Pokedex extends Pokemon {

	static void imprimePokemon(ArrayList<Pokemon> pokemons) {
        String fogo = "FOGO";
        String agua = "AGUA";
        String eletrico = "ELETRICO";
        String planta = "PLANTA";

        System.out.println("+-----------------------------------------------------------+");
        System.out.println("|                        POKEDEX                            |");
        System.out.println("+-----------------------------------------------------------+");		

        System.out.println("|--------------------POKEMONS DE PLANTA-----------------------|");
        for (int i = 0; i < 10; i++) {

            if(pokemons.get(i).getTipo().equals(planta)) {
            	Visualizacao(i, pokemons);
            }
        }

        System.out.println("\n|-------------------POKEMONS DE FOGO----------------------|");
        for (int i = 0; i < 10; i++) {

            if(pokemons.get(i).getTipo().equals(fogo)) {
            	Visualizacao(i, pokemons);;
            }
        }

        System.out.println("\n|--------------------POKEMONS DE AGUA--------------------|");
        for (int i = 0; i < 10; i++) {

            if(pokemons.get(i).getTipo().equals(agua)) {
            	Visualizacao(i, pokemons);
            }
        }

        System.out.println("\n|-------------------POKEMONS ELETRICOS--------------------|");
        for (int i = 0; i < 10; i++) {

            if(pokemons.get(i).getTipo().equals(eletrico)) {
            	Visualizacao(i, pokemons);
            }
        }
    }
    
    public static void Visualizacao(int i, ArrayList<Pokemon> pokemons){

        System.out.println("NOME: " + pokemons.get(i).getNome());
        System.out.println("TIPO: " + pokemons.get(i).getTipo());
        System.out.println("DESCRICAO: " + pokemons.get(i).getDescricao());
        System.out.println("EVOLUCAO: " + pokemons.get(i).getEvolucao());				
        System.out.println("\n");
    }
}