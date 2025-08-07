package lk.edu.student.springdeployment.repo;
import lk.edu.student.springdeployment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

