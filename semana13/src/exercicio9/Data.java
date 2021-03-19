package exercicio9;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void setDia(int dia) {
		if (getMes() != 2) {
			if (dia > 0 && dia <= 31) {
				this.dia = dia;
			}
		} else {
			if (dia > 0 && dia <= 29) {
				this.dia = dia;
			}
		}
	}
	public int getDia() {
		return this.dia;
	}
	
	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		}
	}
	public int getMes() {
		return this.mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	
	public String exibirData() {
		return String.format("%d/%d/%d", getMes(), getDia(), getAno());
	}
}
