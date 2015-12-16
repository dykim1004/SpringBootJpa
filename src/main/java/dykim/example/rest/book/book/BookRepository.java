package dykim.example.rest.book.book;

/**
 * Created by kimdoyong on 2015. 12. 15..
 */
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String>{
}