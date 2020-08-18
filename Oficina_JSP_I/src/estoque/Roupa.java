package estoque;

public class Roupa {
	private String tipo;
	private String marca;
	private double valor;
	private int qtde;
		
	public Roupa(String tipo, String marca, double valor, int qtde) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
		this.qtde = qtde;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
}
