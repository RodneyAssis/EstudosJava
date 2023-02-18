package oo.composicao.desafiomeu;

public class clienteMain {
	public static void main(String[] args) {
		
		Relatorio rel = new Relatorio();
		Cliente c1 = new Cliente();
		Compra cr1 = new Compra();
		
		String nome = "João";
		
		

		c1.adicionarCompra(cr1);
		
		rel.adicionarRelatorio(new Cliente(nome, c1.compralist));
		
		
		System.out.println(rel.relatorio.get(0).compralist.get(0));
	}
}