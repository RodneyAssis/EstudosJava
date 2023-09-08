package streamapi.reduce.exercicios;

public class ProdutoReduce1 {
    private String nome;
    private double preco;
//    private double antigoPreco;
//    private int desconto;
//    private boolean frete;

    public ProdutoReduce1(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
//        frete(preco);
//        desconto(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

//    public void setAntigoPreco(double antigoPreco) {
//        this.antigoPreco = antigoPreco;
//    }
//    public double getAntigoPreco() {
//        return antigoPreco;
//    }
//    public boolean isFrete() {
//        return frete;
//    }

//    public int getDesconto() {
//        return desconto;
//    }

//    private void frete(double preco){
//        if (preco >= 200) {
//            this.frete = true;
//        }
//    }

//    private void desconto(double preco){
//        if (preco < 100){
//            this.desconto = 0;
//        } else if (preco > 100 && preco <= 200) {
//            this.desconto = 15;
//        } else if (preco > 200) {
//            this.desconto = 30;
//            this.antigoPreco = this.preco;
//            this.preco = preco-(preco*30)/100;
//        }
//    }
}
