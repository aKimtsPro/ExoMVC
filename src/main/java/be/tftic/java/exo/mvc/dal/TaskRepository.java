package be.tftic.java.exo.mvc.dal;

import be.tftic.java.exo.mvc.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
