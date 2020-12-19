package Objetos;

import LojaExemplo.Pessoa;

public class cliente extends pessoa{

    private String CPF;

    public String getCPF() {
        return CPF;
    }


    public cliente(String nome, char genero, int anoNascimento, String cPF) {
        super(nome, genero, anoNascimento);
        CPF = cPF;
    }


    public void corrigirCPF(String CPF) {
        this.CPF = CPF;
    }


}