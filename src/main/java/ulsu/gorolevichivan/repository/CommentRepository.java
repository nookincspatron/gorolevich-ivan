package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.general.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}