package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.auth.UserRole;
import ulsu.gorolevichivan.repository.UserRoleRepository;

@Service
public class UserRoleService {

    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleService(
            UserRoleRepository userRoleRepository
    ) {
        this.userRoleRepository = userRoleRepository;
    }

    public void save(UserRole userRole) {
        this.userRoleRepository.save(userRole);
    }

    public UserRole findById(Long id) {
        return this.userRoleRepository.findFirstById(id);
    }
}