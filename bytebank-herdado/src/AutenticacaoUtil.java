public class AutenticacaoUtil {
    int senha = 2222;

    public int setSenha(int senha) {
        return this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
