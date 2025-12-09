package StudyFlow.senai.com.StudyFlow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudyFlow.senai.com.StudyFlow.models.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
    

