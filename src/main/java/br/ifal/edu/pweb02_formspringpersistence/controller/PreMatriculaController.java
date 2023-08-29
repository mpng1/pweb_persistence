package br.ifal.edu.pweb02_formspringpersistence.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ifal.edu.pweb02_formspringpersistence.dto.PreMatriculaDto;
import br.ifal.edu.pweb02_formspringpersistence.model.PreMatricula;
import br.ifal.edu.pweb02_formspringpersistence.repository.PreMatriculaRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("prematricula")
public class PreMatriculaController {
	
	@Autowired
	private PreMatriculaRepository preMatriculaRepository;

	@GetMapping("form")
	public String form(PreMatriculaDto requisicao) {
		return "form";
	}
	
    @GetMapping("lista")
    public String listPreMatriculas(Model model) {
        List<PreMatricula> preMatriculas = preMatriculaRepository.findAll();
        model.addAttribute("preMatriculas", preMatriculas);
        return "lista";
    }
	
    @PostMapping("novo")
    public String novo(@Valid PreMatriculaDto requisicao, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("validationErrors", result.getAllErrors());
            return "input_errors";
        }

        if (!isValidBrazilianPhoneNumber(requisicao.getTelefone())) {
            result.rejectValue("telefone", "Invalid telefone number");
            model.addAttribute("validationErrors", result.getAllErrors());
            return "input_errors";
        }

        PreMatricula prematricula = requisicao.toPreMatricula();
        preMatriculaRepository.save(prematricula);

        return "redirect:lista";
    }
	
	private boolean isValidBrazilianPhoneNumber(String telefone) {
	    
	    Set<String> validPrefixes = new HashSet<>(Arrays.asList(
	        "61", "62", "64", "65", "66", "67", "82", "71", "73", "74", "75", "77",
	        "85", "88", "98", "99", "83", "81", "87", "86", "89", "84", "79", "68",
	        "96", "92", "97", "91", "93", "94", "69", "95", "63", "27", "28", "31",
	        "32", "33", "37", "35", "38", "21", "22", "24", "11", "12", "13", "14",
	        "15", "16", "17", "18", "19", "41", "42", "43", "44", "45", "46", "51",
	        "53", "54", "55", "47", "48", "49"
	    ));

	    
	    String prefix = telefone.substring(0, 2);

	    return validPrefixes.contains(prefix);
	}
   }



