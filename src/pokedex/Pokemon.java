package pokedex;

public class Pokemon {
	//Atributos
	private String nome;
	private String descricao;
	private String tipo;
	private String evolucao;
	private boolean capturado = false;

    public Pokemon() {
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getEvolucao() {
    	return evolucao;
    }
    
    public void setEvolucao(String evolucao) {
    	this.evolucao = evolucao;
    }
  
    
    public boolean getCapturado() {
    	return capturado;
    }
    
    public void setCapturado(boolean capturado) {
    	this.capturado = capturado;
    }
}
