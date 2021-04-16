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
}
