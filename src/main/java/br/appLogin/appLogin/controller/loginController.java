package br.appLogin.appLogin.controller;

import br.appLogin.appLogin.model.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

    private Usuario ur;


    @GetMapping("/login")
    public  String login () {
        return "login";
    }
    @GetMapping("/cadastroUsuario")
    public String cadastro(){
        return "cadastro";
    }

    @RequestMapping(value = "/cadastroUsuario", method = RequestMethod.POST)
    public String cadastroUsuario(@Valid Usuario usuario, BindingResult result) {

        if(result.hasErrors()){
            return "redirect:/cadastroUsuario";
        }


        return" ";
    }
}
