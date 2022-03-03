package Util.Anônimas;
import java.util.List;
import java.util.ArrayList;

// Classes anônimas é uma classe sem nome que implementa um método.
// As classes anônimas facilitam um pouco a criação de um objeto que criamos para encapsular uma função ou método
// Não é criado a classe, o método é implementado no próprio main, porém dificulta a leitura.
// Logo, o Lambda é necessário
public class Anonima {

    public static void main(String[] args) {

        // Sem lambda - leitura difícil


        List<Conta> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);

        // classe anônima
        lista.sort(new Comparator<Conta>(){

            @Override
            public int compare(Conta c1, Conta c2){
                return Integer.compare(c1.getNumero(), c2.getNumero()); // retorna 0, 1 ou -1
            }
        });

        Comparator<Conta> comp = new Comparator<Conta>() {

            @Override
            public int compare(Conta c1, Conta c2) {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
            }
        };

        lista.forEach(new Consumer<Conta>() {

            @Override
            public void accept(Conta conta) {
                System.out.println(conta + ", " + conta.getTitular().getNome());
            }
        });

        // Com lambda - Foca no pedaço de código que tenho que escrever

        List<Conta> lista = new ArrayList<Conta>();
        lista.add(c1);
        lista.add(c2);

        // como é só uma linha, posso tirar as chaves e o return; Como meu Array é só de Conta, podia tirar também
        // Conta c1 e Conta c2 e só deixar c1 e c2

        // Ordena pelo numero da conta
        lista.sort(
                (Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) // retorna 0, 1 ou -1);
        );

        // Função que ordena pelo nome
        Comparator<Conta> comp = (Conta c1, Conta c2) -> {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
        };

        lista.sort(comp); // vai ordenar por nome

        // ArrayList de Conta então não tem necessidade de especificar que conta é do objeto Conta
        lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

    }
}
