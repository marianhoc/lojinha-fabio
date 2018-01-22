package com.mariano.lojinhafabio.Dao;

import com.mariano.lojinhafabio.model.Pedido;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PedidoDao {
    private static Map<Integer, Pedido> pedidos;

    static {
        pedidos = new HashMap<Integer, Pedido>(){
            {
                put(1, new Pedido());

            }
        };
    }




    public Collection<Pedido> getPedidos(){
        return this.pedidos.values();
    }

    public Pedido getPedidoById(int id){
        return this.pedidos.get(id);
    }




    public void removeProductById(int id) {
        this.pedidos.remove(id);
    }


    public void insertProduct(Pedido pedido) {
        this.pedidos.put(pedido.getId(), pedido);

    }

}
