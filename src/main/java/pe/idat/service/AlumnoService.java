package pe.idat.service;

import java.util.List;

import pe.idat.model.Alumno;

public interface AlumnoService {
	void guardar(Alumno alumno);
	void actualizar(Alumno alumno);
	void eliminar(Integer id);
	List<Alumno> listar();
	Alumno obtener(Integer id);
}
