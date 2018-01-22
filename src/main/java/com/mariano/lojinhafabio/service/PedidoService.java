package com.mariano.lojinhafabio.service;

import com.mariano.lojinhafabio.Dao.PedidoDao;
import com.mariano.lojinhafabio.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PedidoService {

    @Autowired
    private PedidoDao pedidoDao;


    public Collection<Pedido> getPedidos(){
        return this.pedidoDao.getPedidos();
    }

    public Pedido getPedidosById(int id){
        return this.pedidoDao.getPedidoById(id);
    }

    public void removePedidoById(int id) {
        this.pedidoDao.removeProductById(id);
    }

    public void insertPedido(Pedido pedido) {
        this.pedidoDao.insertProduct(pedido);

    }



}
