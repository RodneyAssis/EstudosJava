package generics.dicionarios;

import java.util.*;

public class Pares<C extends Number,V> {
    private final Set<Par<C, V>> itens = new HashSet<>();

    public void adicionar(C chave, V valor){
        if (chave == null) return;

        var novoPar = new Par<C,V>(chave, valor);

        itens.remove(novoPar);

        itens.add(novoPar);
    }

    public V pegarValor(C chave){
        if (chave == null) return null;

        Optional<Par<C,V>> opp = itens.stream()
                .filter(e -> chave.equals(e.getChave()))
                .findFirst();

        return opp.map(Par::getValor).orElse(null);
    }
}
