package dykim.example.jpa;

/**
 * Created by kimdoyong on 2015. 12. 16..
 */
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository <Hello, Integer> {
}