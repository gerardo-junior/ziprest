package com.gerardojunior.ziprest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gerardojunior.ziprest.interfaces.CepService;
import com.gerardojunior.ziprest.model.Endereco;

@RestController
public class CepRestService {

	@Autowired
	private CepService cepService;

	@GetMapping("/{cep}/json")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {
		
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);
		
		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
	}

}
