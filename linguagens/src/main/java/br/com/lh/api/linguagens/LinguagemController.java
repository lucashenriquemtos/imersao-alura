package br.com.lh.api.linguagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository linguagemRepository;

    @GetMapping(value = "/linguagens-preferida")
    public String linguagemPreferida() {
        return "Java";
    }

    @GetMapping(value = "/linguagens")
    public List<Linguagem> listarLinguagens() {
        return linguagens;
    }
}
