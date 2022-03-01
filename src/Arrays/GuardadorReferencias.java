package Arrays;

public class GuardadorReferencias {
    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorReferencias(){
        this.referencias = new Conta[10];
        this.posicaoLivre=0;
    }

    public void adiciona(Conta ref){ // vai receber de parametro um objeto do tipo conta
        this.referencias[this.posicaoLivre] = ref; // posicao livre vai ser 0 primeiro, ai vai adicionar a conta na primeira posição
        this.posicaoLivre++; // agora a proxima conta vai ficar na posicao 1
    }


    public int getQuantidadeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(pos){ // traz a conta dessa posição
        return this.referencia[pos];
    }
}
