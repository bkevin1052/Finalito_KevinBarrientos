/**
*
* @author Kevin Barrientos
*/
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		FabricaDeFiguras nuevaFabrica = new FabricaDeFiguras();
		FabricaDeFiguras fabrica[];
		
		double area,perimetro;
		
		
		Scanner leer = new Scanner(System.in);
		int opt;
		
		System.out.println("Finalito");
		System.out.println("1. Problema 1");
		System.out.println("2. Problema 2");
		System.out.println("3. Problema 3");
		System.out.println("4. Salir");
		opt = leer.nextInt();
		switch(opt)
		{
		case 1:
			String Mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String Minus = "abcdefghijklmnopqrstuvwxyz";
			System.out.println("***PROBLEMA 1***");
			Problema1 cifrado = new Problema1(Mayus, Minus);
			System.out.println(cifrado.cifrarCesar("PANCHITO", 1));//cifrador
			System.out.println(cifrado.descifrarCesar("QBODIJUP", 1,"cesar"));//descifrador
			
			
			break;
		case 2:
			int opcion;
			
			System.out.println("***PROBLEMA 2***");
			System.out.println("1. Cuadrilatero");
			System.out.println("2. Triangulo");
			System.out.println("3. Pentagono");
			System.out.println("4. Hexagono");
			System.out.println("5. Octagono");
			System.out.println("6. Triangulo Isoceles");
			System.out.println("7. Triangulo Equilatero");
			System.out.println("8. Rectangulo");
			System.out.println("9. Cuadrado");
			opcion = leer.nextInt();
			switch(opcion)
			{
			case 1:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearCuadrilatero(area, perimetro);
				break;				
			case 2:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearTriangulo(area, perimetro);
				break;
			case 3:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearPentagono(area, perimetro);
				break;
			case 4:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearHexagono(area, perimetro);
				break;
			case 5:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearOctagono(area, perimetro);
				break;
			case 6:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearTrianguloIsoceles(area, perimetro);
				break;
			case 7:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearTrianguloEquilatero(area, perimetro);
				break;
			case 8:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearRectangulo(area, perimetro);
				break;
			case 9:
				System.out.println("Escriba el area:");
				area = leer.nextDouble();
				System.out.println("Escriba el perimetro:");
				perimetro = leer.nextDouble();				
				nuevaFabrica.crearCuadrado(area, perimetro);
				break;				
			}			
			break;
		case 3:
			ManoCartas manoCarta = new ManoCartas();
			int cant,valor,option;
			String categoria;
			System.out.println("***PROBLEMA 3***");
			System.out.println("1. Agregar cartas");
			System.out.println("2. Jugar");
			option = leer.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Cantidad de cartas para agregar:");
				cant = leer.nextInt();
				for(int i = 0; i < cant; i++)
				{
					System.out.println("Ingrese el valor de la carta {" + i + "}:");
					valor = leer.nextInt();
					System.out.println("Ingrese la categoria de la carta {" + i + "}:");
					categoria = leer.next();
					manoCarta.agregarCarta(valor, categoria);				
				}
				break;
			case 2:
				System.out.println("Ingrese la categoria de la carta:");
				categoria = leer.next();
				manoCarta.jugar(categoria);
				break;			
			}			
			break;
		default:
			break;			
		}
	}
}
