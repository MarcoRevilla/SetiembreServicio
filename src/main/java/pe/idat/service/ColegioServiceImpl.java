package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Colegio;
import pe.idat.repository.ColegioRepository;

@Service
public class ColegioServiceImpl implements ColegioService {
	
	@Autowired
	private ColegioRepository repositorio;
	
	@Override
	public void guardar(Colegio colegio) {
		// TODO Auto-generated method stub
		repositorio.save(colegio);
	}

	@Override
	public void actualizar(Colegio colegio) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(colegio);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Colegio> listar() {
		// TODO Auto-generated method stub
		 return repositorio.findAll();
	}

	@Override
	public Colegio obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
