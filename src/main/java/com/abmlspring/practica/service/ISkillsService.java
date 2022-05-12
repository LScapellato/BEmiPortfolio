
package com.abmlspring.practica.service;

import com.abmlspring.practica.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List <Skills> getSkills();
    public void saveSkills(Skills skills);
    public void deleteSkills(int id);
    public Skills findSkills (int id);
    
}
