package vista;
import java.util.Scanner;
import controlador.*;
public class Interfaz {
	
	private Scanner entrada= new Scanner(System.in);
    private Controlador c;
    
    
	public String obtenerNombre() {
		
		String nombre= "";
		System.out.println("Ingrese el nombre:");
		nombre=entrada.nextLine();
		return nombre;
		}
	public String obtenerCedula() {
		
		String cedula= "";
		System.out.println("Ingrese la cedula:");
		cedula= entrada.nextLine();
		return cedula;
		}
	public double obtenerSalario() {
		
		double salario= 0;
		System.out.println("Ingrese el salario:");
		salario= entrada.nextDouble();
		return salario;
	}
	public int obtenerContrato() {
		
		int contrato= 0;
		System.out.println("Ingrese el tipo de contrato:");
		contrato=entrada.nextInt();
		return contrato;
		}
	
	public void imprimirLiquidacion(String pNombre,String pCedula, double pSalario, int pContrato, double pDesc, double pLoq) {
		
		System.out.println("**Los datos del empleado 1 son:");
		System.out.println("Nombre:"+ pNombre);
		System.out.println("Cedula:"+ pCedula);
		System.out.println("Salario:"+pSalario);
		System.out.println("Tipo De Contrato:"+ pContrato);
		System.out.println("Total Descuentos:"+pDesc);
		System.out.println("Salario Liquido:"+ pLoq);
		System.out.println("\n ** Fin de Registro");


		}
    
}
