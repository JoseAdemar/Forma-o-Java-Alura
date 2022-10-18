public class Cliente implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public int setSenha(int senha) {
        return this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
