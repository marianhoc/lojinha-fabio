package com.mariano.lojinhafabio.util;

public enum TypeOfProduct {

    PIZZAS("Pizzas"),
    BEBIDAS("Bebidas"),
    SOBREMESAS("Sobremesas");

    private String name;

    TypeOfProduct(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }



}
