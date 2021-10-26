package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.common.Dictionary;

public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {
}