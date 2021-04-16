package exercicio08;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private List<Conta> contas = new ArrayList<Conta>();

    public void adiciona(Conta conta){
        this.contas.add(conta);
    }

    public int getQuantidadeDeContas() {
        return contas.size();
    }
    
    public Conta buscaPorTitular(String titular) {
        return contas.stream().filter(c -> c.nomeDoTitular.equals(titular)).findFirst().orElse(null);
    }
}
