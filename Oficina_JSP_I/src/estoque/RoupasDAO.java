package estoque;
import java.util.ArrayList;

public class RoupasDAO {

	private ArrayList<Roupa> listaRoupas;
	
	public RoupasDAO() {
		listaRoupas = new ArrayList<Roupa>();
		
		this.listaRoupas.add(new Roupa("berumda", "pakalolo", 30, 5));
		this.listaRoupas.add(new Roupa("vestido", "gucci", 400, 6));
		this.listaRoupas.add(new Roupa("jaqueta", "tng", 150, 4));
		this.listaRoupas.add(new Roupa("camiseta", "supreme", 100, 7));
		this.listaRoupas.add(new Roupa("calça", "levi's", 200, 11));
	}
		
	public ArrayList<Roupa> getListaRoupas() {
		return listaRoupas;
	}
	
}
