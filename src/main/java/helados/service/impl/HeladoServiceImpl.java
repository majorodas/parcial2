package helados.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import helados.dao.IHeladoDAO;
import helados.model.Helado;
import helados.service.IHeladoService;

@Service
public class HeladoServiceImpl implements IHeladoService {

	@Autowired
	private IHeladoDAO dao;	
	
	@Override
	public Helado registrar(Helado t) {
		return dao.save(t);
	}

	@Override
	public Helado modificar(Helado t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Helado> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Helado> listar() {
		return dao.findAll();
	}

}
