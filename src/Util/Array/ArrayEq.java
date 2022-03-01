package Util.Array;

import Arrays.GuardadorReferencias;

import java.util.ArrayList;

public class ArrayEq {
    // código abaixo é um generics
    ArrayList<Conta> lista = new ArrayList<Conta>(); // se não tivesse <Conta>, iria guardar ArrayList de qualquer coisa
    // já que tem, guarda ArrayList só de Conta (ArrayList de tipo Conta)

    GuardadorReferencias guardador = new GuardadorReferencias();
    Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

    Conta cc2 = new ContaCorrente(22,11);
        lista.add(cc2); // add adiciona na lista

    ArrayList auxiliar = new ArrayList(lista); // copia uma lista pra outra

        System.out.println(lista.size()); // size traz todas as referencias guardadas

        lista.get(0); // get traz elemento na posição 0

        lista.remove(0); // remove remove o elemento da posição 0

    // forma mais antiga
        for(int i=0; i<lista.size();i++){
        System.out.println(lista.get(i)); // imprime cada elemento de conta
    }

    // forma mais simples

        /* se eu quisesse fazer um foreach em um ArrayList genérico (guarda vários tipos),
         eu colocaria Object oref invés de Conta oref. Como o ArrayList só guarda Conta, posso colocar Conta oref */
        for(Conta oRef : lista){ // pra cada elemento do tipo Conta dessa lista; como se fosse foreach
        System.out.println(oRef);
    }
}

