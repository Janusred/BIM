package com.carmona.app.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carmona.app.api.dao.IClientes;
import com.carmona.app.api.dao.ICredito;
import com.carmona.app.api.models.Clientes;
import com.carmona.app.api.models.Credito;
@Service
public class CreditoService implements IService<Credito, Credito>{

	
	
	
	@Autowired
	private ICredito creditoDao;
	@Override
	public List<Credito> listar() {
		// TODO Auto-generated method stub
		return (List<Credito>) this.creditoDao.findAll();
	}

	@Override
	public Optional<Credito> getById(Long id) {
		// TODO Auto-generated method stub
		return this.creditoDao.findById(id);
	}

	@Override
	public void guardar(Credito t) {
		// TODO Auto-generated method stub
		this.creditoDao.save(t);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		this.creditoDao.deleteById(id);
	}

}
