public class Debito extends Operacao {


    public Debito(double valor) {
        setValor(valor);
    }

    @Override
    public double operar() {
        return getValor() * -1;
    }


}
