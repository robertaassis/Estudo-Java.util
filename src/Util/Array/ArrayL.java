package Util.Array;
import Arrays.GuardadorReferencias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Arquivo Array escrito de uma forma mais prática (com ArrayList invés de Array puro)
public class ArrayL {
    public static void main(String[] args) {

        // código abaixo é um generics
        ArrayList<Conta> lista = new ArrayList<Conta>(); // se não tivesse <Conta>, iria guardar ArrayList de qualquer tipo
        // já que tem, guarda ArrayList só de Conta (ArrayList de tipo Conta)

        GuardadorReferencias guardador = new GuardadorReferencias();
        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        List<String> argumentos = Arrays.asList(args); // transforma um array para uma lista

        Conta cc2 = new ContaCorrente(22,11);
        lista.add(cc2); // add adiciona na lista

        ArrayList auxiliar = new ArrayList(lista); // copia uma lista pra outra

        System.out.println(lista.size()); // size traz todas as referencias guardadas

        lista.get(0); // get traz elemento na posição 0

        lista.remove(0); // remove remove o elemento da posição 0

        /* contains usa o próprio método Equals; se eu quiser fazer um Equals com outro código, eu monto a função equals e coloco @Override acima da função
        logo, o contains utilizará esse equals que eu criei, não o próprio */
        // equals compara referências
        boolean existe = lista.contains(cc2); // contains retorna true or false pra se existe ou não o elemento na lista
        System.out.println("Existe na lista? " + existe);

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
}
