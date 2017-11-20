/**
*
* @author Kevin Barrientos
*/
public class ManoCartas
{
	private String palo;
	private int valor;
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	LinkedPositionalList<ManoCartas> lista = new LinkedPositionalList<>();
	Position<ManoCartas> p1,p2,p3,p4;
	public void agregarCarta(int valor, String categoria)
	{
		ManoCartas carta = new ManoCartas();
		carta.setValor(valor);
		carta.setPalo(categoria);
		p1 = lista.addFirst(carta);
		if(carta.getPalo() == "corazon")
		{
			p2 = lista.addFirst(carta);
		}
		else if(carta.getPalo() == "espadas")
		{
			p3 = lista.addBefore(p2, carta);
		}
		else if(carta.getPalo() == "diamante")
		{
			p4 = lista.addBefore(p3, carta);
		}
		else if(carta.getPalo() == "trebol")
		{
			lista.addBefore(p4, carta);
		}
		else
		{
			System.out.println("Categoria no valida");
		}
	}
	
	public void jugar(String categoria)
	{
		if(lista.first().getElement().getPalo() == categoria)
		{
			lista.remove(p3);
		}
		else
		{
			lista.remove(p1);
		}
	}
}
