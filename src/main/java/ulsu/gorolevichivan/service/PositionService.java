package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.structure.Position;
import ulsu.gorolevichivan.repository.PositionRepository;

@Service
public class PositionService {

    private final PositionRepository positionRepository;

    @Autowired
    public PositionService(
            PositionRepository positionRepository
    ) {
        this.positionRepository = positionRepository;
    }

    public void save(Position position) {
        this.positionRepository.save(position);
    }

    public Position findById(Long id) {
        return this.positionRepository.findFirstById(id);
    }
}