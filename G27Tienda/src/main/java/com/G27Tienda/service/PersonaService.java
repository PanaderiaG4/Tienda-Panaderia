package com.G27Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.G27Tienda.Interfaces.iPersona;
import com.G27Tienda.Modelo.Persona;

@Service
public class PersonaService implements IpersonaService{
	
	private iPersona dato;
	
	@Override
	public List<Persona> listar()
	{
		return (List<Persona>)dato.findAll();
	}
	
	@Override
	public Optional<Persona> listarId(int id)
	{
		return null;
	}
	
	@Override
	public int save(Persona p)
	{
		return 0;
	}
	
	public void delete(int id)
	{
		
	}
	

}
