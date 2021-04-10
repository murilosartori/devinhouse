package exercicio16;

public class FuncionarioComissionado extends Funcionario {
	private double vendasBrutas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, String sobrenome, String CPF, double vendasBrutas, double taxaComissao) {
        super(nome, sobrenome, CPF);
        this.vendasBrutas = validaVendasBrutas(vendasBrutas);
        this.taxaComissao = validarTaxaComissao(taxaComissao);
    }
    
    public double getVendaBruta() {
    	return this.vendasBrutas;
    }
    public void setVendaBruta(double bruta) {
    	this.vendasBrutas = validaVendasBrutas(bruta);
    }
    
    public double getTaxaComissao() {
    	return this.taxaComissao;
    }
    public void setTaxaComissao(double comissao) {
    	this.taxaComissao = validarTaxaComissao(comissao);
    }

    public double validaVendasBrutas(double valor) {
        return Math.max(valor, 0.00);
    }

    public double validarTaxaComissao(double taxa) {
        if ( taxa >= 0.00 && taxa < 1) {
            return taxa;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nSobrenome: %s%nCPF: %s%nValor Venda Bruta: R$ %.2f%nTaxa Comissão: %.2f", this.getNome(), this.getSobrenome(), this.getCPF(), this.vendasBrutas, this.taxaComissao * 100);
    }

    public double ganhos() {
        return this.taxaComissao * this.vendasBrutas;
    }
}
