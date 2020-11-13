package dominio;

public class Pessoa {
	public int id;
	public String nome;
	public float mensalidade;
	public boolean bolsista;
	
	public Pessoa() {
		this.nome = "Donald";
	}
	
	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}
	
	public Pessoa (String nome, float mensalidade) {
		this(nome);
		this.mensalidade = mensalidade;
	}
	
	public void imprimir() {
		System.out.printf("%s *** %d\n", 
				toString(), this.id);
	}
	
	public float calcularDesconto() {
		return this.bolsista == true ? this.mensalidade / 2 : this.mensalidade;
	}
	
	public String obterTipo() {
		return this.bolsista == true ? "Bolsista" : "Pagante";
	}
	
	@Override
	public String toString() {		
		
		return String.format("%-10s | %8.2f | %-8s | %8.2f |", 
				this.nome, this.mensalidade, obterTipo(), calcularDesconto());
	}

}