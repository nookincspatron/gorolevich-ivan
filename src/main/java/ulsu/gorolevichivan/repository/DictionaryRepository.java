package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.common.Dictionary;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {

    Dictionary findFirstById(Long id);

    Dictionary findFirstByTypeAndValue(String type, String value);
}