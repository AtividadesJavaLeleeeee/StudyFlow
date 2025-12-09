package StudyFlow.senai.com.StudyFlow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudyFlow.senai.com.StudyFlow.models.Material;
import StudyFlow.senai.com.StudyFlow.repositories.MaterialRepository;

@Service
public class MaterialService {
    @Autowired
    public MaterialRepository materialRepository;

    //count
    public Long count() {
        return materialRepository.count();
    }

    //findById
    public Material findById(Integer id) {
        return materialRepository.findById(id).get();
    }

    //findAll
    public List<Material> listar(){
            return materialRepository.findAll();
    }

    //save
    public Material salvar(Material produto) {
        return materialRepository.save(produto);
    }  

    //update
    public Material save(Material material, Integer id) {
        Material e = findById(id);
        if (e != null) {
            material.setId(id);
            return materialRepository.save(material);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Material material = materialRepository.findById(id).get();
        if(material != null) {
            materialRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
