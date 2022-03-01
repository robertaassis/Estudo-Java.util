package Util.Array;
import Arrays.GuardadorReferencias;

import java.util.ArrayList;

// Arquivo Array escrito de uma forma mais prática (com ArrayList invés de Array puro)
public class ArrayL {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        GuardadorReferencias guardador = new GuardadorReferencias();
        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,11);
        lista.add(cc2); // add adiciona na lista

        System.out.println(lista.size()); // size traz todas as referencias guardadas

        lista.get(0); // get traz elemento na posição 0

        lista.remove(0); // remove remove o elemento da posição 0

        // forma mais antiga
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i)); // imprime cada elemento de conta
        }

        // forma mais simples
        for(Object oRef : lista){ // pra cada elemento do tipo Object dessa lista; como se fosse foreach
            System.out.println(oRef);
        }
    }
}
