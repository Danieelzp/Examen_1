package tiposPruebaCovid;

import pacientes.Paciente;

public final class PruebaPCR implements PruebaCovid19 { //inmutabilidad

	private Paciente paciente;
	
	//inyeccion de dependencia
	public PruebaPCR(Paciente paciente) { 
		this.paciente = paciente; //Composicion
	}
	
	//sobreescritura de metodos
	@Override
	public boolean isPositiveCase() {
		
		if(paciente.getTemperatura() >= 39 && paciente.getVomito() == true) {
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
