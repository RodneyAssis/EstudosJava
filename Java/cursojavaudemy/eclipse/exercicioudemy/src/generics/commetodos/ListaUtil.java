package generics.commetodos;

import java.util.List;

public class ListaUtil {
    public static Object pegarUltimo(List<?> lista){
        return lista.get(lista.size()-1);

    }

    public static <Typeer> Typeer pegarUltimoValorUniversal(List<Typeer> lista2) {
        return lista2.get(lista2.size() -1);
    }
}
