package controlador;
import modelo.Mundo;

import vista.Interfaz;
public class Controlador {
	private Mundo m;
	private Interfaz gui;
	public Controlador() {
		
		 m=new Mundo();
		 gui=new Interfaz();
		 
		 
		 m.getEmp1().setNombre(gui.obtenerNombre());
		 m.getEmp1().setCedula(gui.obtenerCedula());
		 m.getEmp1().setSalarioMensual(gui.obtenerSalario());
		 m.getEmp1().setTipoContrato(gui.obtenerContrato());
		 m.getEmp1().liquidarSalario();
		 
		 gui.imprimirLiquidacion(m.getEmp1().getNombre(),
				                 m.getEmp1().getCedula(),
				                 m.getEmp1().getSalarioMensual(),
				                 m.getEmp1().getTipoContrato(), 
				                 m.getEmp1().getTotalDescuentos(),
				                 m.getEmp1().getSalarioLiquido());

		 
	}
	public Mundo getM() {
		return m;
	}
	public void setM(Mundo m) {
		this.m = m;
	}
	public Interfaz getGui() {
		return gui;
	}
	public void setGui(Interfaz gui) {
		this.gui = gui;
	}
	
	}
