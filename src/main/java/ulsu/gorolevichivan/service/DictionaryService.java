package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.common.Dictionary;
import ulsu.gorolevichivan.repository.DictionaryRepository;

@Service
public class DictionaryService {

    public static final String STATUS = "Статус";
    public static final String STATUS_IN_WORK = "В работе";
    public static final String STATUS_COMPLETED = "Завершён";
    public static final String STATUS_PENDING_REVIEW = "Требует проверки";
    public static final String STATUS_ON_REVIEW = "На проверке";

    private final DictionaryRepository dictionaryRepository;

    @Autowired
    public DictionaryService(
            DictionaryRepository dictionaryRepository
    ) {
        this.dictionaryRepository = dictionaryRepository;
    }

    public void save(Dictionary dictionary) {
        this.dictionaryRepository.save(dictionary);
    }

    public void saveIfNotExists(String type, String value) {
        if (this.findByTypeAndValue(type, value) == null) {
            Dictionary dictionary = new Dictionary();
            dictionary.setType(type);
            dictionary.setValue(value);
            this.save(dictionary);
        }
    }

    public Dictionary findById(Long id) {
        return this.dictionaryRepository.findFirstById(id);
    }

    public Dictionary findByTypeAndValue(String type, String value) {
        return this.dictionaryRepository.findFirstByTypeAndValue(type, value);
    }

    public Dictionary getStatus(String value) {
        return this.dictionaryRepository.findFirstByTypeAndValue(STATUS, value);
    }

    public Boolean isStatusInWork(Dictionary status) {
        return status.getValue().equals(STATUS_IN_WORK);
    }

    public Boolean isStatusCompleted(Dictionary status) {
        return status.getValue().equals(STATUS_COMPLETED);
    }

    public Boolean isStatusPendingReview(Dictionary status) {
        return status.getValue().equals(STATUS_PENDING_REVIEW);
    }

    public Boolean isStatusOnReview(Dictionary status) {
        return status.getValue().equals(STATUS_ON_REVIEW);
    }
}