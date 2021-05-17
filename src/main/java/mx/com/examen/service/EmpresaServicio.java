package mx.com.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.examen.dao.EmpresaDao;
import mx.com.examen.dto.Empresa;

@Service
public class EmpresaServicio {
	@Autowired
	private EmpresaDao empresaDao;
	
	public List<Empresa> listaCompleta() {
		return empresaDao.listaCompleta();
	}
	
	public void save(Empresa empresa) {
		empresaDao.save(empresa);
	}
}
