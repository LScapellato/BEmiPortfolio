
package com.abmlspring.practica.service;

import com.abmlspring.practica.model.Skills;
import com.abmlspring.practica.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    private SkillsRepository skrepository;

    @Override
    public List<Skills> getSkills() {
        List<Skills> listaskills =skrepository.findAll();
        return listaskills;
    }

    @Override
    public void saveSkills(Skills skills) {
        skrepository.save(skills);
        
    }

    @Override
    public void deleteSkills(int id) {
        skrepository.deleteById(id);
    }

    @Override
    public Skills findSkills(int id) {
        Skills skill =skrepository.findById(id).orElse(null);
        return skill;
    }
    
}
