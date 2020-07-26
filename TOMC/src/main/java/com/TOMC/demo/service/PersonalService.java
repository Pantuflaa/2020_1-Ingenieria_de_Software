package com.TOMC.demo.service;

import java.util.List;

import com.TOMC.demo.entity.Personal;
import com.TOMC.demo.repository.PersonalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicepersonal")
public class PersonalService{
    @Autowired
    @Qualifier("repositorypersonal")
    private PersonalRepository repository;

    public boolean addPersonal(Personal personal){
    	try{
    		repository.save(personal);
    		return true;
    	} catch (Exception e){
    		return false;
    	}
    }

    public boolean updatePersonal(Personal personal){
    	try{
    		repository.save(personal);
    		return true;
    	} catch (Exception e){
    		return false;
    	}
    }

    public boolean deletePersonal(long id){
    	try{
    		Personal personal = repository.findById(id);
    		repository.delete(personal);
    		return true;
    	} catch (Exception e){
            return false;
        }
    }

    public Personal getByID(long id){
    	return repository.findById(id);
    }

    public List<Personal> getAll(){
        return repository.findAll();
    }

	public List<Personal> getByType(int tipoPersonal){
        return repository.findByTipoPersonal(tipoPersonal);
	}
	public List<Personal> getByDisponibilidad(boolean disponibilidad){
        return repository.findByDisponibilidad(disponibilidad);
    }
}