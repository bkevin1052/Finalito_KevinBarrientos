/**
*
* @author Kevin Barrientos
*/
public class FabricaDeFiguras {

	
	public Cuadrilatero crearCuadrilatero(double area, double perimetro)
	{
		Cuadrilatero cuadrilatero = new Cuadrilatero(area, perimetro);
		
		return cuadrilatero;
	}
	

	public Triangulo crearTriangulo(double area, double perimetro)
	{
		Triangulo triangulo = new Triangulo(area, perimetro);
		
		return triangulo;
	}
	
	public Hexagono crearHexagono(double area, double perimetro)
	{
		Hexagono Hexagono = new Hexagono(area, perimetro);
		
		return Hexagono;
	}
	
	public Pentagono crearPentagono(double area, double perimetro)
	{
		Pentagono Pentagono = new Pentagono(area, perimetro);
		
		return Pentagono;
	}
	
	public Octagono crearOctagono(double area, double perimetro)
	{
		Octagono Octagono = new Octagono(area, perimetro);
		
		return Octagono;
	}
	
	public TrianguloIsoceles crearTrianguloIsoceles(double area, double perimetro)
	{
		TrianguloIsoceles TrianguloIsoceles = new TrianguloIsoceles(area, perimetro);
		
		return TrianguloIsoceles;
	}
	
	public TrianguloEquilatero crearTrianguloEquilatero(double area, double perimetro)
	{
		TrianguloEquilatero TrianguloEquilatero = new TrianguloEquilatero(area, perimetro);
		
		return TrianguloEquilatero;
	}
	
	public Rectangulo crearRectangulo(double area, double perimetro)
	{
		Rectangulo Rectangulo = new Rectangulo(area, perimetro);
		
		return Rectangulo;
	}
	
	public Cuadrado crearCuadrado(double area, double perimetro)
	{
		Cuadrado Cuadrado = new Cuadrado(area, perimetro);
		
		return Cuadrado;
	}
	
	
	
	
	
	
	
}
