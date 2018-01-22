package com.mariano.lojinhafabio.controllers;

import com.mariano.lojinhafabio.model.Pedido;
import com.mariano.lojinhafabio.model.Product;
import com.mariano.lojinhafabio.service.PedidoService;
import com.mariano.lojinhafabio.service.ProductService;
import com.mariano.lojinhafabio.service.UserService;
import com.mariano.lojinhafabio.util.OrigemDoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPedidos(Model model) {
        model.addAttribute("pedidos", pedidoService.getPedidos());
        return "pedidos/index";

    }
    @RequestMapping("/{id}")
    public String pedido(@PathVariable("id") Integer id, Model model) {

        model.addAttribute("pedido", pedidoService.getPedidosById(id));
        return "pedidos/show";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String novoPedido(Model model){
        Pedido pedido = new Pedido();
        pedido.setId(pedidoService.getPedidos().size());


        model.addAttribute("products", productService.getProducts());
        model.addAttribute("pedido", pedido);
        model.addAttribute("list-of-item-id", new ArrayList());

        return "pedidos/novo";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String novoPedido(HttpServletRequest httpServletRequest, Model model, RedirectAttributes redirectAttributes){

        Pedido p = new Pedido();
        List<Product> produtos = new ArrayList<Product>();
        p.setId(pedidoService.getPedidos().size()+1);
        p.setOrigem(OrigemDoPedido.BALCAO);
        p.setCliente(userService.getUserById(Integer.parseInt(httpServletRequest.getParameter("user-id"))));
        p.setDisconto(0);
        p.setItensPedido(produtos);
        pedidoService.insertPedido(p);

        return "redirect:/pedidos";
    }


}
