package com.mariano.lojinhafabio.model;

import com.mariano.lojinhafabio.util.OrigemDoPedido;
import java.util.List;


public class Pedido {
    private int id;
    private List<Product> itensPedido;
    private OrigemDoPedido origem;
    private double disconto;
    private User cliente;

    public Pedido(){};

    public Pedido(int id,List<Product> itensPedido, OrigemDoPedido origem, double disconto, User cliente) {
        this.id = id;
        this.itensPedido = itensPedido;
        this.origem = origem;
        this.disconto = disconto;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<Product> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public OrigemDoPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemDoPedido origem) {
        this.origem = origem;
    }

    public double getDisconto() {
        return disconto;
    }

    public void setDisconto(double disconto) {
        this.disconto = disconto;
    }

    public User getCliente() {
        return cliente;
    }

    public void setCliente(User cliente) {
        this.cliente = cliente;
    }
}
