package hospitales;

public enum Hospital {
	
	NICOYA("Hospital de Nicoya"), 
	
	MEXICO("Hospital de México"); 
	
	private String tipo;

	
	private Hospital(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
