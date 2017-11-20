
/**
*
* @author Kevin Barrientos
*//**
*
* @author Kevin Barrientos
*/
public class Problema1 {
	
	
	private String Mayus;
	private String Minus;
	
	
	/**
	 * Metodo constructor
	 */
	public Problema1(String Mayus, String Minus)
	{
	this.Mayus = Mayus;
	this.Minus = Minus;
	}
	
	/**
	 * Metodo que cifra un mensaje
	 * @param frase
	 * @param distancia
	 */
	public String cifrarCesar(String frase, int distancia)
	{
		String resultado = "";
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(this.Mayus.indexOf(frase.charAt(i)) != -1 || this.Minus.indexOf(frase.charAt(i)) != -1 )
			{
				resultado += (this.Mayus.indexOf(frase.charAt(i)) != -1) ? this.Mayus.charAt(((this.Mayus.indexOf(frase.charAt(i))) + distancia)% this.Minus.length()) : this.Minus.charAt(((this.Minus.indexOf(frase.charAt(i))) + distancia)% this.Mayus.length());
			}else
			{
				resultado += frase.charAt(i);
			}
		}		
		
		return resultado;	
	}
	

	/**
	 * Metodo que descifra un mensaje
	 * @param frase
	 * @param distancia
	 * @param alfabeto
	 */
	public String descifrarCesar(String frase, int distancia, String alfabeto)
	{
		String resultado = "";
		if(alfabeto == "cesar")
		{
		for(int i = 0; i < frase.length(); i++)
		{
			if(this.Mayus.indexOf(frase.charAt(i)) != -1 || this.Minus.indexOf(frase.charAt(i)) != -1 )
			{
				if(this.Mayus.indexOf(frase.charAt(i)) != -1)
				{
					if((this.Mayus.indexOf(frase.charAt(i)) - distancia) < 0)
					{
						resultado += this.Mayus.charAt((this.Mayus.length())+((this.Mayus.indexOf(frase.charAt(i))) - distancia));
					}
					else
					{
						resultado += this.Mayus.charAt((this.Mayus.indexOf(frase.charAt(i))) - distancia) %(this.Mayus.length());
					}
				}
				else
				{
					if(this.Minus.indexOf(frase.charAt(i)) < 0)
					{
						resultado += this.Minus.charAt((this.Minus.length())+((this.Minus.indexOf(frase.charAt(i))) - distancia));
					}
					else
					{
						resultado += this.Minus.charAt(((this.Minus.indexOf(frase.charAt(i))) - distancia) %(this.Minus.length()));
					}
				}
			}
			else
			{
				resultado += frase.charAt(i);
			}
		}
		}
		else
		{
			System.out.println("Alfabeto incorrecto");
		}
		
		return resultado;	
		
	}

}
