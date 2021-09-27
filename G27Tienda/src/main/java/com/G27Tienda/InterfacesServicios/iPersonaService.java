package com.G27Tienda.InterfacesServicios;

import java.util.List;
import java.util.Optional;

import com.G27Tienda.Modelo.Persona;

public interface iPersonaService {
	
	public List<Persona> listar();
	public Optional<Persona> listarid(int id);
	public int save(Persona p);
	public void delete (int id);
	public void agregar(Persona p);
	

}