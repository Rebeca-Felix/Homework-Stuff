
public class PacienteINFO {
//Atributos para a classe paciente, aqui é se é criado a categorização dos valores para informar ao sistema e ele gerar a conta//
	
	double peso;
	double altura;
	double IMC;
	String laudo;

	//Definindo Informações do Paciente
	public PacienteINFO(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
		
	}
//Definindo Calculo IMC
	double calculo(){
		IMC = peso / (altura * altura);
		return IMC;
	}
	
	//Diagnóstico do IMC
	//Baixo peso muito grave = IMC abaixo de 16 kg/m²
	//Baixo peso grave = IMC entre 16 e 16,99 kg/m²
	//Baixo peso = IMC entre 17 e 18,49 kg/m²
	//Peso normal = IMC entre 18,50 e 24,99 kg/m²
	//Sobrepeso = IMC entre 25 e 29,99 kg/m²
	//Obesidade grau I = IMC entre 30 e 34,99 kg/m²
	//Obesidade grau II = IMC entre 35 e 39,99 kg/m²
	//Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
	
	String Resultado() {
		IMC = calculo();
		//Não esquecer de if e logo em seguida de else if
		if(IMC < 16){
			laudo = "Baixo peso muito grave";
		}
		
		else if(IMC < 16.99){
			laudo = "Baixo peso grave";
		}
		
		else if(IMC < 18.49){
			laudo = "Baixo peso";
		}
		
		else if(IMC < 24.99){
			laudo = "Peso normal";
		}
		

		else if(IMC < 29.99){
			laudo = "Sobrepeso";
		}

		else if(IMC < 34.99){
			laudo = "Obesidade I";
		}

		else if(IMC < 39.99){
			laudo = "Obesidade II";
		}

		else if(IMC > 40){
			laudo = "Obesidade III";
		}
		return laudo;
		
	}
	
}
