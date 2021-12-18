package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.auth.UserRoleActions;
import ulsu.gorolevichivan.repository.UserRoleActionsRepository;

@Service
public class UserRoleActionsService {

    private final UserRoleActionsRepository userRoleActionsRepository;

    @Autowired
    public UserRoleActionsService(
            UserRoleActionsRepository userRoleActionsRepository
    ) {
        this.userRoleActionsRepository = userRoleActionsRepository;
    }

    public void save(UserRoleActions userRoleActions) {
        this.userRoleActionsRepository.save(userRoleActions);
    }

    public UserRoleActions findById(Long id) {
        return this.userRoleActionsRepository.findFirstById(id);
    }
}