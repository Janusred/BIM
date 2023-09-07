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

import com.carmona.app.api.models.Clientes;
import com.carmona.app.api.service.IService;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins="*")
public class ClienteController {

	


	@Autowired
	IService<Clientes, Clientes> clientesService;

	@PostMapping
	public Map<String, String> guardar(@RequestBody Clientes v) {
		clientesService.guardar(v);
		Map<String, String> respuesta = new HashMap<>();
		respuesta.put("msg", "Cliente ingresado");
		return respuesta;
	}
	
	@GetMapping
	public List<Clientes> listar() {
		return clientesService.listar();
	}
	
	@DeleteMapping("/eliminar")
	public Map<String, String> eliminar(@RequestParam(name = "id") Long id) {
		clientesService.eliminar(id);
		Map<String, String> respuesta = new HashMap<>();
		respuesta.put("msg", "Cliente eliminado");
		return respuesta;
	}

	
}
