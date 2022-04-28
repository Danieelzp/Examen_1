package tiposPruebaCovid;

import pacientes.Paciente;

public final class PruebaRapida implements PruebaCovid19 { //inmutabilidad

	private Paciente paciente;
	
	//inyeccion de dependencia
	public PruebaRapida(Paciente paciente) {
		this.paciente = paciente; //Composicion
	}
	
	//sobreescritura de metodos
	@Override
	public boolean isPositiveCase() {
		
		if(paciente.getTemperatura() >= 37 && paciente.getEdad() >= 60) {
			return true;
		}
		else {
		return false;
		}
	}

	//sobreescritura de metodos
	@Override
	public String getNombrePaciente() {
		return paciente.getNombre();
	}

}
