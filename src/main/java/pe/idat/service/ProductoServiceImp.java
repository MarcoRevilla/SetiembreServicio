package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Producto;
import pe.idat.repository.ProductoRepository;
@Service
public class ProductoServiceImp implements ProductoService {
	
	@Autowired
	private ProductoRepository repositorio;
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.save(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
