package StudyFlow.senai.com.StudyFlow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StudyFlow.senai.com.StudyFlow.models.Material;
import StudyFlow.senai.com.StudyFlow.services.MaterialService;



@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    public MaterialService materialService;

    //count
    @GetMapping("/count")
    public Long count() {
        return materialService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Material find(@PathVariable Integer id) {
        return materialService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Material> list() {
        return materialService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Material salvar(@RequestBody Material produto) {
        return materialService.salvar(produto);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Material save(@PathVariable Integer id, @RequestBody Material produto){
        return materialService.save(produto, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = materialService.delete(id);
        if (deletou) {
            return "Produto excluido!";
        }
        return "Falha ao excluir produto.";
    }
}


