package com.carmona.app.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carmona.app.api.models.Credito;
import com.carmona.app.api.service.IService;
@RestController
@RequestMapping("/api/credito")
@CrossOrigin(origins="*")
public class CreditoController {

	
	
	@Autowired
	IService<Credito, Credito> creditosService;

	@PostMapping
	public Map<String, String> guardar(@RequestBody Credito v) {
		creditosService.guardar(v);
		Map<String, String> respuesta = new HashMap<>();
		respuesta.put("msg", "Cliente ingresado");
		return respuesta;
	}
	
	@GetMapping
	public List<Credito> listar() {
		return  creditosService.listar();
	}
	
	@DeleteMapping("/eliminar")
	public Map<String, String> eliminar(@RequestParam(name = "id") Long id) {
		creditosService.eliminar(id);
		Map<String, String> respuesta = new HashMap<>();
		respuesta.put("msg", "Cliente eliminado");
		return respuesta;
	}

	
}
