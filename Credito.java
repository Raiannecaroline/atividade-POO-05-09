public class Credito extends Operacao {


    public Credito(double valor) {
        setValor(valor);
    }

    @Override
    public double operar() {
        return getValor();
    }
}
