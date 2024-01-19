package jdbc.verificarRegistros;

import java.util.UUID;

public class Produtos {

    private UUID ID;
    private String nome;

    public Produtos(UUID ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
