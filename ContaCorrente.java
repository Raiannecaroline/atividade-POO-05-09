public class ContaCorrente {

    private double saldoConta = 0;

    public double getSaldo() {
        return saldoConta;
    }

    public void executarOperacao(Operacao operacao) {
        this.saldoConta += operacao.operar();
    }

}
