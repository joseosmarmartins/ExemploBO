package com.joseosmar;

import com.joseosmar.model.Contato;
import com.joseosmar.model.ContatoBO;
import com.joseosmar.model.ContatoDAO;

public class Main {

    public static void main(String[] args) {
        try {
            Contato contato = new Contato();
            contato.setId(Long.parseLong("1"));
            contato.setNome("José Osmar Martins Silva");

            ContatoBO bo = new ContatoBO(new ContatoDAO());
            bo.adiciona(contato);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
