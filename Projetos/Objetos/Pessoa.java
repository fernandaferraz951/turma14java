package Objetos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class pessoa {

    private String nome;
    private char genero;
    private int anoNascimento;


    public pessoa(String nome, char genero, int anoNascimento) {
        super();
        this.nome = nome;
        this.genero = genero;
        this.anoNascimento = anoNascimento;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public char getGenero() {
        return genero;
    }


    public void setGenero(char genero) {
        this.genero = genero;
    }


    public int getAnoNascimento() {
        return anoNascimento;
    }


    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }


    public int voltaIdade() {
        Calendar ano = GregorianCalendar.getInstance();
        int anoAtual=ano.get(Calendar.YEAR);

        return (anoAtual - this.anoNascimento);
    }


}

