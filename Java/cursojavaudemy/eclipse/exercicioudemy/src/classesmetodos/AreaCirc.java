package classesmetodos;

public class AreaCirc {
	
	double raio;
	// static double pi = 3.14;
	final static double pi = 3.14; //ficou um valor constante imutavel
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return Math.pow(raio, 2)*pi;
	}
	
	static double raio(double raio){
		return Math.pow(raio, 2)*pi;
	}
}
