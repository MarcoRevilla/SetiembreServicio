package pe.idat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.idat.model.Alumno;
import pe.idat.repository.AlumnoRepository;
@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	private AlumnoRepository repositorio;
	@Override
	public void guardar(Alumno alumno) {
		// TODO Auto-generated method stub
		repositorio.save(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(alumno);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Alumno> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Alumno obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
