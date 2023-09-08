package streamapi.filter.desafiofilterdogometroespecial.desafiododesafio;

public class Produtos {
    private String nome;
    private int preco;
    private int antigoPreco;
    private int desconto;
    private boolean frete;

    public Produtos(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        frete(preco);
        desconto(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getAntigoPreco() {
        return antigoPreco;
    }

    public void setAntigoPreco(int antigoPreco) {
        this.antigoPreco = antigoPreco;
    }

    public boolean isFrete() {
        return frete;
    }

    public int getDesconto() {
        return desconto;
    }

    private void frete(int preco){
        if (preco >= 200) {
            this.frete = true;
        }
    }

    private void desconto(int preco){
        if (preco < 100){
            this.desconto = 0;
        } else if (preco > 100 && preco <= 200) {
            this.desconto = 15;
        } else if (preco > 200) {
            this.desconto = 30;
            this.antigoPreco = this.preco;
            this.preco = preco-(preco*30)/100;
        }
    }
}

