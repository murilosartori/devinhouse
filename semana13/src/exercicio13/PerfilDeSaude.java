package exercicio13;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PerfilDeSaude {
	private final String nome;
    private final String sobrenome;
    private final String sexo;
    private final String dataNascimento;
    private final double altura;
    private final double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        LocalDate nascimento = LocalDate.parse(this.dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return Period.between(nascimento, LocalDate.now()).getYears();
    }

    public int getFrequenciaMaxima() {
        return 220 - this.getIdade();
    }

    public String getFaixaFrequenciaAlvo() {
        double minimo  = this.getFrequenciaMaxima() * 0.5;
        double maximo = this.getFrequenciaMaxima() * 0.8;
        return String.format("minimo de %.2f e máximo de %.2f", minimo, maximo);
    }

    public double getIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }
}
