package Arrays;

    public class Array {

        // Array
        public static void main(String[] args) {

            int idades[] = new int[5]; // inicializa com valores do array sendo 0
            for (int i = 0; i < idades.length; i++) {
                idades[i] = i * i;
            }

            for (int i = 0; i < idades.length; i++) {
                System.out.println(idades[i]);
            }

            // faz um array com 5 espaços, mas vai ocupar o array de forma dinamica
            GuardadorReferencias guardador = new GuardadorReferencias();
            Conta cc = new ContaCorrente(22,11);
            guardador.adiciona(cc);

            int tamanho = guardador.getQuantidadeElementos();
            System.out.println(tamanho);

            Conta ref= guardador.getReferencia(0); // traz a conta na posição 0 e guarda em ref

        }
}
