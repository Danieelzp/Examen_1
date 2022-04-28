package pacientes;

public final class Paciente { 
	//inmutabilidad
	private final String nombre;
	private final int edad;
	private final int temperatura;
	private final boolean vomito;
	
	public Paciente(String nombre, int edad, int temperatura, boolean vomito) {
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.vomito = vomito;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getTemperatura() {
		return this.temperatura;
	}
	
	public boolean getVomito() {
		return this.vomito;
	}
}
