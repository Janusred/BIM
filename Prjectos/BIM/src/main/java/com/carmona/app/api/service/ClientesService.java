package com.carmona.app.api.service;




import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carmona.app.api.dao.IClientes;
import com.carmona.app.api.models.Clientes;


@Service
public class ClientesService implements IService<Clientes, Clientes> {

	
	
	@Autowired
	private IClientes clientesDao;
	@Override
	public List<Clientes> listar() {
		// TODO Auto-generated method stub
		return (List<Clientes>) this.clientesDao.findAll();	}

	@Override
	public Optional<Clientes> getById(Long id) {
		// TODO Auto-generated method stub
		return this.clientesDao.findById(id);
	}

	@Override
	public void guardar(Clientes t) {
		// TODO Auto-generated method stub
		this.clientesDao.save(t);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		this.clientesDao.deleteById(id);
	}

	

	
	
}
