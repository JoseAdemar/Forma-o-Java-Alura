public class GuardadorDeContas {
    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre ++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getContaReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
