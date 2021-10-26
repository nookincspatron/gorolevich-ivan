package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.structure.Relationship;

public interface RelationshipRepository extends JpaRepository<Relationship, Long> {
}