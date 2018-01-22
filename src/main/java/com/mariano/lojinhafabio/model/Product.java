package com.mariano.lojinhafabio.model;


import com.mariano.lojinhafabio.util.TypeOfProduct;

public class Product {

    private int id;
    private String name;
    private double value;
    private TypeOfProduct typeOfProduct;

    public Product(int id, String name, double value, TypeOfProduct tipo) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.typeOfProduct = tipo;
    }

    public Product() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(TypeOfProduct typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
}
