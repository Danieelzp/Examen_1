package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalNicoya extends OMS { //Herencia
	
	Hospital hospital = Hospital.NICOYA;

	//inyeccion de dependencias
	public HospitalNicoya(List<Paciente> pacientes) {
		super(pacientes);
	}

	//sobreescritura de metodos
	@Override
	protected boolean isGamHospital() {
		return false;
	}

	//sobreescritura de metodos
	@Override
	public Hospital getNombreHospital() {
		return hospital;
	}

}
