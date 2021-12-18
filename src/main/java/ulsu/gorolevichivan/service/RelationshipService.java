package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.structure.Relationship;
import ulsu.gorolevichivan.repository.RelationshipRepository;

@Service
public class RelationshipService {

    private final RelationshipRepository relationshipRepository;

    @Autowired
    public RelationshipService(
            RelationshipRepository relationshipRepository
    ) {
        this.relationshipRepository = relationshipRepository;
    }

    public void save(Relationship relationship) {
        this.relationshipRepository.save(relationship);
    }

    public Relationship findById(Long id) {
        return this.relationshipRepository.findFirstById(id);
    }
}