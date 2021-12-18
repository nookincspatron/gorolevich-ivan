package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.general.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}