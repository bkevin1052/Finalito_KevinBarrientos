/**
*
* @author Kevin Barrientos
*/
public class Hexagono implements Poligono{

	private double Area;
	private double Perimetro;
	
	public Hexagono(double area, double perimetro)
	{
		this.setArea(area);
		this.setPerimetro(perimetro);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getArea();
	}

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
