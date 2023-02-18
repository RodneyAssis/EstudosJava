package classesmetodos;

public class Data {
	int dia ,mes ,ano;
	
	
	//DesafioConstrutor
	Data(){	
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	Data(int dia, int mesPadrao, int anoPadrao){
		this.dia = dia;
		mes = mesPadrao;
		ano = anoPadrao;
	}
	//Desafio metodo
	String obterDataFormtada() {
		return String.format("%02d/%02d/%04d\n", dia,mes,ano);
	}

	/*// não é possivel se fazer em um metodo estatico
	static void algumaCoisa() {
		this dia = 3;
	}
	 */
}