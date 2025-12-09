package StudyFlow.senai.com.StudyFlow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudyFlow.senai.com.StudyFlow.models.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {
}