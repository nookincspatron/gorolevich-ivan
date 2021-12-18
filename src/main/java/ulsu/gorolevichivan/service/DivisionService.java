package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.structure.Division;
import ulsu.gorolevichivan.repository.DivisionRepository;

@Service
public class DivisionService {

    public static final String BACK_END = "Отдел разработки (Back-End)";
    public static final String FRONT_END = "Отдел разработки (Front-End)";
    public static final String QA = "Отдел контроля качества (Q&A)";
    public static final String DESIGN = "Отдел дизайна (UI/UX)";
    public static final String PM = "Отдел управления проектами (PM)";
    public static final String HR = "Отдел по работе с персоналом (HR)";

    private final DivisionRepository divisionRepository;

    @Autowired
    public DivisionService(
            DivisionRepository divisionRepository
    ) {
        this.divisionRepository = divisionRepository;
    }

    public void save(Division division) {
        this.divisionRepository.save(division);
    }

    public void saveIfNotExists(String title, String responsibilities) {
        if (this.findByTitle(title) == null) {
            Division division = new Division();
            division.setTitle(title);
            division.setResponsibilities(responsibilities);
            this.save(division);
        }
    }

    public Division findById(Long id) {
        return this.divisionRepository.findFirstById(id);
    }

    public Division findByTitle(String title) {
        return this.divisionRepository.findFirstByTitle(title);
    }

    public Division getBackEnd() {
        return this.findByTitle(BACK_END);
    }

    public Division getFrontEnd() {
        return this.findByTitle(FRONT_END);
    }

    public Division getQA() {
        return this.findByTitle(QA);
    }

    public Division getDesign() {
        return this.findByTitle(DESIGN);
    }

    public Division getPM() {
        return this.findByTitle(PM);
    }

    public Division getHR() {
        return this.findByTitle(HR);
    }
}