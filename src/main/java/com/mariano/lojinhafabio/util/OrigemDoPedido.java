package com.mariano.lojinhafabio.util;

public enum OrigemDoPedido {
    BALCAO("Balcão"),
    TELEFONE("Telefone"),
    INTERNET("Internet");

    private String name;

    OrigemDoPedido(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    }
