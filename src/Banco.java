import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> listarContas() {

        System.out.println("=== Lista de contas do banco ===");
        for (Conta conta : contas){
            System.out.println(conta);
        }
        return contas;
    }
}
