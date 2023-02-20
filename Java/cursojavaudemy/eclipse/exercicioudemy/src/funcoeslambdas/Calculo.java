package funcoeslambdas;

@FunctionalInterface
public interface Calculo {
	double executa(double a, double b);
//	void teste();
	
//existe a possibilidade da interface passar metodos defaults e static, porem metodos abstrados não pode ser realizado
	default String top() {
		return "apenas uma string";
	}
	
	static String massa() {
		return "outra possibilidade -_-";
	}
}
