package exercicio12;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FrequenciaCardiaca {
	private String nome;
    private String sobrenome;
    private String dataNascimento;

    public FrequenciaCardiaca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        LocalDate nascimento = LocalDate.parse(this.dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return Period.between(nascimento, LocalDate.now()).getYears();
    }

    public int getFrequenciaMaxima() {
        return 220 - this.getIdade();
    }

    public int getFrequenciaAlvo() {
        return (int) (this.getFrequenciaMaxima() * 0.675);
    }
}
