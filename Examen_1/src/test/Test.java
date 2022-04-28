package test;

import java.util.ArrayList;
import java.util.List;

import hospitales.HospitalMexico;
import hospitales.HospitalNicoya;
import oms.OMS;
import pacientes.Paciente;

public class Test {

	public static void main(String[] args) {
		
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		Paciente paciente1 = new Paciente("Daniel",24,32,true);
		Paciente paciente2 = new Paciente("Mariano",28,25,false);
		Paciente paciente3 = new Paciente("Dariana",16,38,false);
		Paciente paciente4 = new Paciente("Luis",24,32,true);
		Paciente paciente5 = new Paciente("Fernanda",28,25,false);
		Paciente paciente6 = new Paciente("Mario",16,38,false);
		Paciente paciente7 = new Paciente("Valeria",24,32,true);
		Paciente paciente8 = new Paciente("Edgar",28,25,false);
		Paciente paciente9 = new Paciente("Alex",16,38,false);
		
		pacientes.add(paciente1);
		pacientes.add(paciente2);
		pacientes.add(paciente3);
		pacientes.add(paciente4);
		pacientes.add(paciente5);
		pacientes.add(paciente6);
		pacientes.add(paciente7);
		pacientes.add(paciente8);
		pacientes.add(paciente9);
		
		//Polimorfismo
		OMS hospitalMex = new HospitalMexico(pacientes);
		OMS hospitalNic =  new HospitalNicoya(pacientes);
		
		hospitalMex.imprimirReporte();
		hospitalNic.imprimirReporte();
		
		
		
	}

}
