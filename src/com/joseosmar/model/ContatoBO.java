package com.joseosmar.model;

public class ContatoBO {

    private final ContatoDAO dao;

    public ContatoBO(ContatoDAO dao) {
        this.dao = dao;
    }

    public void adiciona(Contato contato) throws Exception {
        if (!contato.getNome().isEmpty()) {
            dao.adiciona(contato);
        } else {
            throw new Exception("Nome deve ser informado!");
        }
    }
}
