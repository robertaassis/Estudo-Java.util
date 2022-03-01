package Arrays;

public class ArrayReferencia {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente c1 = new ContaCorrente(22,22); // cria o objeto (aponta pra ContaCorrente)
        contas[0]=c1; // c1 entra no vetor contas (da ContaCorrente aponta pro vetor)

        ContaCorrente ref = contas[0]; // aponta pro mesmo lugar que c1 apontou (ContaCorrente); esse lugar "guarda" as info de c1
        System.out.println();
    }
}
