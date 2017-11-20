/**
*
* @author Kevin Barrientos
*/
public class Cuadrado implements Poligono{
	private double Area;
	private double Perimetro;
	
	/**
	 * Metodo constructor
	 * @param area
	 * @param perimetro
	 */
	public Cuadrado(double area, double perimetro)
	{
		this.setArea(area);
		this.setPerimetro(perimetro);
	}
	
	/**
	 * Metodo que retorna el area
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getArea();
	}

	/**
	 * Metodo que retorna el perimetro
	 */
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getPerimetro();
	}
	public double getPerimetro() {
		return Perimetro;
	}
	public void setPerimetro(double perimetro) {
		Perimetro = perimetro;
	}
	public double getArea() {
		return Area;
	}
	public void setArea(double area) {
		Area = area;
	}
}
