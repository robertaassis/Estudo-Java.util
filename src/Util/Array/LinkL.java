package Util.Array;

/* LinkedList; ArrayList tem tamanho limitado (elementos precisam ser copiados quando não há mais capacidade) já LinkedList consegue manipular a lista para que se algo
 for removido, o espaço vazio seja reorganizado automaticamente para não ficar vazio */

import Arrays.GuardadorReferencias;
import java.util.LinkedList;
import java.util.List;

// "Lista duplamente encadeada"; pra achar um elemento tem que percorrer a lista desde o inicio,
// o que é desvantagem em relação ao array, que você consegue acessar o espaço desejado
public class LinkL {
    public static void main(String[] args) {

        // compartilham os mesmos métodos (remove, add, get)
        LinkedList<Conta> linkedl = new LinkedList<Conta>();

        // List é interface geral de lista
        List<Conta> lista = new LinkedList<Conta>();

        GuardadorReferencias guardador = new GuardadorReferencias();
        Conta cc = new ContaCorrente(22,11);
        linkedl.add(cc);

        Conta cc2 = new ContaCorrente(22,11);
        linkedl.add(cc2);

        System.out.println(linkedl.size());

        linkedl.get(0);

        linkedl.remove(0);


        boolean existe = linkedl.contains(cc2);
        System.out.println("Existe na lista? " + existe);


        for(int i = 0; i< linkedl.size(); i++){
            System.out.println(linkedl.get(i));
        }


        for(Conta oRef : linkedl){
            System.out.println(oRef);
        }

    }
}
