package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.structure.Relationship;

@Repository
public interface RelationshipRepository extends JpaRepository<Relationship, Long> {

    Relationship findFirstById(Long id);
}