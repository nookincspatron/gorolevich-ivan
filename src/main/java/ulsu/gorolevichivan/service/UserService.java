package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.auth.User;
import ulsu.gorolevichivan.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void save(User user) {
        this.userRepository.save(user);
    }

    public User findById(Long id) {
        return this.userRepository.findFirstById(id);
    }

    public User findByUsername(String username) {
        return this.userRepository.findFirstByUsername(username);
    }

    public User getCurrentUser() {
        return this.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
    }

    public Boolean verify(
            String username,
            String password) {
        User user = this.findByUsername(username);
        return passwordEncoder.matches(password, user.getPassword());
    }
}