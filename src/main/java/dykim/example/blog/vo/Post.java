package dykim.example.blog.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by kimdoyong on 2016. 1. 2..
 */
@Entity
@ToString
public class Post {
    @Id
    @GeneratedValue
    @Getter @Setter
    int id;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false)
    @Getter @Setter
    String title;

    @Size(max = 255)
    @Getter @Setter
    String subtitle;

    @Size(min = 1, max = 100000000)
    @Column(length = 100000000)
    @Getter @Setter
    String content;

    @Getter @Setter
    Date regDate;


}
