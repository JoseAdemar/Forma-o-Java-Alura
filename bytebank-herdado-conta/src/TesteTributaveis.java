public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorDeImposto cal = new CalculadorDeImposto();
        cal.registrar(cc);
        cal.registrar(sv);

        System.out.println(cal.getTotalImposto());

    }
}
