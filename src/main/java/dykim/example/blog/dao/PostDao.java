package dykim.example.blog.dao;

import dykim.example.blog.vo.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by kimdoyong on 2016. 1. 2..
 */
public interface PostDao extends JpaRepository<Post, Integer> {
}
