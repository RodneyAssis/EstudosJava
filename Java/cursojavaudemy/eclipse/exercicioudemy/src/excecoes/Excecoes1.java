package excecoes;

public class Excecoes1 {
    public static void main(String[] args) {
        try {
            Erro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void Erro1() {
        throw new RuntimeException("Erro louco");
    }
}
