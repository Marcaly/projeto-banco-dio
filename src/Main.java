public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Meu banco");

        Cliente marcio = new Cliente("marcio");
        Conta poupancaMarcio = new ContaPoupanca(marcio);
        banco.adicionarConta(poupancaMarcio);

        Cliente saulo = new Cliente("saulo");
        Conta ccSaulo = new ContaCorrente(saulo);
        banco.adicionarConta(ccSaulo);



        ccSaulo.depositar(300.0);
        ccSaulo.transferir(200.0, poupancaMarcio);
        ccSaulo.imprimirExtrato();
        poupancaMarcio.imprimirExtrato();

        banco.listarContas();

    }
    }
