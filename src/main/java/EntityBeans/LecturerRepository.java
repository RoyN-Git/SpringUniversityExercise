package EntityBeans;

import EntityBeans.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LecturerRepository  extends JpaRepository<Lecturer ,Integer> {
    List<Lecturer> findBySalaryLessThan(int salary);
    List<Lecturer> findBySalaryGreaterThan(int salary);
    List<Lecturer> findByNameContaining(String name);
    //int findByNameContaining(String name);
    List<Lecturer> findByNameContainingAndSalaryGreaterThan(String name, int salary);
    List<Lecturer> findByAgeBetween(int minAge, int maxAge);
}