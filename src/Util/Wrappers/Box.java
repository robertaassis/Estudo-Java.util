package Util.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class Box {
    public static void main(String[] args) {
        int idade=29;
        // Integer idadeRef= Integer.valueOf(29); o java faz esse codigo debaixo dos panos; transforma primitivo em objeto (Integer)
        List<Integer> numeros = new ArrayList<Integer>(); // Não existe Lista de primitivos (int, double), apenas de referências (Integer, Double)
        // um valor primitivo é passado como um parâmetro para um método que espera um objeto.
        // Integer, Double, Float são classes Wrapper
        numeros.add(29); // Autoboxing = Autoboxing é o mecanismo para converter um tipo de dados primitivo no respectivo objeto
    }
}
