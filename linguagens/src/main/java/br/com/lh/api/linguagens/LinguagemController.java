package br.com.lh.api.linguagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @GetMapping(value = "/linguagens")
    public String linguagemPreferida() {
        return "Java";
    }
}
