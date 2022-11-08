package br.inatel;

import br.inatel.manager.impl.Observador;
import br.inatel.manager.impl.Observavel;

public class Main {

    public static void main(String[] args) {

        // Criando o observavel (subject) netflix.
        Observavel palavraManager = new Observavel();

        //Criando 3 observadores e fazendo a inscrição em Netflix.
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        palavraManager.registraObservador(obs1);
        palavraManager.registraObservador(obs2);
        palavraManager.registraObservador(obs3);

        palavraManager.setNovaFrase("Hoje ta muito Frio irado");



//        String frase = "hoje ta muito frio";
//
//        System.out.println(frase);
//
//        String[] nova = frase.split(" ");
//
//        System.out.println(nova.length);

    }
}
