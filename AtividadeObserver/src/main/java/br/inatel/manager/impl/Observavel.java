package br.inatel.manager.impl;

import br.inatel.manager.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    private String frase;
    private int qtdPalavras;
    private int qtdPalavrasPares;
    private int qtdPalavrasMaiusculas;

    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    public void setNovaFrase(String frase) {
        System.out.println("Nova palavra adicionada");
        this.frase = frase;
        contaPalavras(this.frase);
        novasMedidas();
    }

    //Esse método é chamado sempre que os valores
    //se modificacam
    private void novasMedidas() {
        notificaObservadores();
    }

    private void contaPalavras(String s){

        String[] palavras = s.split(" ");
        qtdPalavras = palavras.length;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes = clientes;
    }

    public List<Observador> getClientes() {
        return clientes;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getQtdPalavras() {
        return qtdPalavras;
    }

    public void setQtdPalavras(int qtdPalavras) {
        this.qtdPalavras = qtdPalavras;
    }

    public int getQtdPalavrasPares() {
        return qtdPalavrasPares;
    }

    public void setQtdPalavrasPares(int qtdPalavrasPares) {
        this.qtdPalavrasPares = qtdPalavrasPares;
    }

    public int getQtdPalavrasMaiusculas() {
        return qtdPalavrasMaiusculas;
    }

    public void setQtdPalavrasMaiusculas(int qtdPalavrasMaiusculas) {
        this.qtdPalavrasMaiusculas = qtdPalavrasMaiusculas;
    }
}
