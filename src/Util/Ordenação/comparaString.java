package Util.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// link util para estudar comparable https://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/amp/

public class comparaString {
    public static void main(String[] args) {

        String n1 = String.valueOf("oii");
        String n3 = String.valueOf("como");
        String n4 = String.valueOf("aaa");

        List nomes = new ArrayList<>();
        nomes.add(n1);
        nomes.add(n4);
        nomes.add(n3);

        // compara string
        if(n1.equals(n4)) {
            System.out.println("str1 igual a str2");
        }
        else{
            System.out.println("nao está");
        }

        // ordena string
        Collections.sort(nomes);
        for(int i = 0; i< nomes.size(); i++ )
        {
            System.out.println(nomes.get(i));
        }

        Collections.reverse(nomes); // inverte ordenação
        for(int i = 0; i< nomes.size(); i++ )
        {
            System.out.println(nomes.get(i));
        }

    }

}


