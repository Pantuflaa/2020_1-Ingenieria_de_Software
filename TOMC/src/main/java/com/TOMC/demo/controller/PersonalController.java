package com.TOMC.demo.repository;

import java.util.List;

import javax.validation.Valid;

import com.TOMC.demo.entity.Personal;
import com.TOMC.demo.service.PersonalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/personal")
public class PersonalController{
    @Autowired
    @Qualifier("servicepersonal")
    PersonalService service;

    @GetMapping("/personal/{id}")
    public Personal getPersonal(@PathVariable("id") long id){
        return service.getByID(id);
    }

    @PostMapping("/personal")
    public boolean addPersonal(@RequestBody @Valid Personal personal){
        return service.addPersonal(personal);
    }

    @PutMapping("/personal")
    public boolean updatePersonal(@RequestBody @Valid Personal personal){
        return service.updatePersonal(personal);
    }

    @DeleteMapping("/personal/{id}")
    public boolean deletePersonal(@PathVariable("id") long id){
        return service.deletePersonal(id);
    }

    @GetMapping("/getAll")
    public List<Personal> getAllPersonal(){
        return service.getAll();
    }

    @GetMapping("/personal/tipo/{tipoPersonal}")
    public List<Personal> getByTipoPersonal(@PathVariable("tipoPersonal") int tipoPersonal){
        return service.getByType(tipoPersonal);
    }
    
    @GetMapping("/personal/disp/{disponibilidad}")
    public List<Personal> getByDisponibilidad(@PathVariable("disponibilidad") boolean disponibilidad){
        return service.getByDisponibilidad(disponibilidad);
    }
}
