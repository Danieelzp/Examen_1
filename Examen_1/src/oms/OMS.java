package oms;

import java.util.ArrayList;
import java.util.List;
import pacientes.Paciente;
import tiposPruebaCovid.PruebaCovid19;
import tiposPruebaCovid.PruebaPCR;
import tiposPruebaCovid.PruebaRapida;
import hospitales.Hospital;

public abstract class OMS {
	
	private List<Paciente> pacientes;
	private List<PruebaCovid19> resultadoList = new ArrayList<PruebaCovid19>();
	
	//inyeccion de dependencia
	public OMS(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	protected abstract boolean isGamHospital();
	public abstract Hospital getNombreHospital();
	
	private void diagnosticar() {
		
		for (Paciente paciente : pacientes) {
			
			PruebaCovid19 pruebaCovid19 = null;
			
			if (isGamHospital()) {
				//polimorfismo
				pruebaCovid19 = new PruebaPCR(paciente);
				
			} else {
				//polimorfismo
				pruebaCovid19 = new PruebaRapida(paciente);
			}
			
			resultadoList.add(pruebaCovid19);
		}
	}
	
	public final void imprimirReporte() { //Inmutable
		diagnosticar();
		
		System.out.println("HOSPITAL: "+getNombreHospital());
		
		for(int i=0; i< resultadoList.size(); i++) {
			
			System.out.println(resultadoList.get(i));
			
		}
		


	}

}
