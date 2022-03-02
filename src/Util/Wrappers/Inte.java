package Util.Wrappers;

// Wrapper Integer

/* PRIMITIVO                 WRAPPER
              autoboxing
    int       ---->        java.lang.Integer
              unboxing
              <----

    Primitivo pra Wrapper é autoboxing, o contrário é unboxing
*/
public class Inte {
    public static void main(String[] args) {

        Integer idadeRef= Integer.valueOf(29); // autoboxing; valueOf tem pra int, string e double. Ex: se colocar um numero como string la, ele transforma a string em numero.
        // ex: "10" vai se transformar em 10; encapsulam a variável de tipo primitivo
        int primit = idadeRef.intValue(); // unboxing; retorna o numero em int (retorna o numero usado em primitivo)

        int numero = Integer.parseInt("10"); // transforma string "10" em int (10)


    }
}
