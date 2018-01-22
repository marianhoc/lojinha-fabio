package com.mariano.lojinhafabio.controllers;

import com.mariano.lojinhafabio.model.User;
import com.mariano.lojinhafabio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("usuarios")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("users", userService.getUsers());
        return "user/index";
    }

    @RequestMapping("/{id}")
    public String user(@PathVariable("id") Integer id, Model model) {

        model.addAttribute("user", userService.getUserById(id));
        return "user/show";
    }


    @RequestMapping("/new")
    public String novoUsuario(){
        return "user/novo";
    }

    @RequestMapping(value = "/cadastrar-usuario", method=RequestMethod.POST)
    public String criarUsuario(HttpServletRequest httpServletRequest, Model model,  RedirectAttributes redirectAttributes){
        User user = new User();
        user.setName(httpServletRequest.getParameter("name"));
        user.setAddress(httpServletRequest.getParameter("address"));
        user.setTel(httpServletRequest.getParameter("tel"));
        user.setFidelidade(true);
        user.setId(userService.getUsers().size()+1);
        userService.insertUser(user);

        redirectAttributes.addFlashAttribute("warn", "Usuário criado.");
        return "redirect:/usuarios/"+user.getId();
    }

}
