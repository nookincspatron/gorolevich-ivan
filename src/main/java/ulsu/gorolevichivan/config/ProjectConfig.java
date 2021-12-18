package ulsu.gorolevichivan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ulsu.gorolevichivan.entity.general.Project;

@Configuration
@ComponentScan("ulsu.gorolevichivan.entity")
public class ProjectConfig {
    @Bean
    @Primary
    public Project configureCatalogue() {
        Project project = new Project();
        return project;
    }

}
