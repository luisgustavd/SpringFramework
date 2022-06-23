package com.java.aula2;
//BIBLIOTECAS
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
//Controller é declarado para 'iniciar' uma ordenação de caminho para pergunta & resposta.
//Direcionamento do fluxo de dados entre as camadas de apresentação e aplicação.
//Controller é um padrão de arquitetura de software.
@Controller
public class EmpregoController {
    @Autowired
    EmpregoRepository empregoRepository;
    //
    @RequestMapping("/")
    public String listaEmprego(Model model){
        model.addAttribute("empregos", empregoRepository.findAll());
        return "lista";
    }
    //
    @GetMapping("/add")
    public String empregoForm(Model model){
        model.addAttribute("emprego", new Emprego());
        return "empregoForm";
    }
    @PostMapping("/process")
    public String processForm(@Valid Emprego emprego,BindingResult result ){
        if(result.hasErrors()){
            return "empregoForm";
        }
        empregoRepository.save(emprego);
        return "redirect:/";
    }
}
