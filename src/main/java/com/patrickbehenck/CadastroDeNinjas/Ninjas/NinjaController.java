package com.patrickbehenck.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "This is my first message in this route!";
    }

}
