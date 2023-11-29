
public class CalcIMC {
	public static void main(String[] args) {
		//Indentificação do paciente com seus dados
		PacienteINFO PacienteClara = new PacienteINFO(50.00, 1.80);
		PacienteINFO PacienteJohn = new PacienteINFO(78.00, 1.80);
		PacienteINFO PacienteLucca = new PacienteINFO(110.00, 1.78);
		PacienteINFO PacienteTristana = new PacienteINFO(64.00, 1.74);
		
		//Resultado via Print para o sistema
		System.out.println("Resultado do Exame IMC da Paciente Clara: " + PacienteClara.Resultado());
		System.out.println("Resultado do Exame IMC do Paciente John: " + PacienteJohn.Resultado());
	    System.out.println("Resultado do Exame IMC do Paciente Lucca: " + PacienteLucca.Resultado());
	    System.out.println("Resultado do Exame IMC da Paciente Tristana: " + PacienteTristana.Resultado());
		}
}
