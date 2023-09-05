public class AppBanco {

    public static void main(String[] args) {

       ContaCorrente contaCorrente1 = new ContaCorrente();
       ContaCorrente contaCorrente2 = new ContaCorrente();
       ContaCorrente contaCorrente3 = new ContaCorrente();

       Banco banco = new Banco("Raiane", contaCorrente1, "Elvis", contaCorrente2, "Emanoel", contaCorrente3);


       banco.creditar("Raiane", 3000.0d);
       banco.debitar("Elvis", 1000.0d);
       banco.transferir("Emanoel", "Raiane", 300.0d);

       Correntista correntista3 = banco.getCorrentista("Emanoel");

        System.out.println("Saldo do Correntista 1: " + banco.getSaldo("Raiane"));
        System.out.println("Saldo do Correntista 2: " + banco.getSaldo("Elvis"));
        System.out.println("Saldo do Correntista 3 " + correntista3.getContaCorrente().getSaldo());


    }

}
