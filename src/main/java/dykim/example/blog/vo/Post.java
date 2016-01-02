package dykim.example.blog.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by kimdoyong on 2016. 1. 2..
 */
@Entity
public class Post {
    @Id
    @GeneratedValue
    @Getter @Setter
    int id;
    @Getter @Setter
    String subject;

    @Column(length = 100000000)
    @Getter @Setter
    String content;

    @Getter @Setter
    Date regDate;



}
