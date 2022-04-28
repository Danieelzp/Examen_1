package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalMexico extends OMS{ //Herencia

	Hospital hospital = Hospital.MEXICO;
	
	//inyeccion de dependencias
	public HospitalMexico(List<Paciente> pacientes) {
		super(pacientes); 
	}

	//sobreescritura de metodos
	@Override
	protected boolean isGamHospital() {
		return true; //Polimorfismo
	}

	//sobreescritura de metodos
	@Override
	public Hospital getNombreHospital() {
		return hospital; 
	}

}
