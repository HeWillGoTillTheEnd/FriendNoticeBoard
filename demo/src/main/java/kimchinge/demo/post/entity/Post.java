package kimchinge.demo.post.entity;

import kimchinge.demo.audit.Auditable;
import kimchinge.demo.comment.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//데이터베이스 테이블에서
    //기본키가 되는 식별자를 자동으로 설정해준다.
    private long postId;

    private String title;

    private String body;

//    private enum postLocation//게시판구분
    //라이크 가져와야함
    private String image;

    private PostStatus postStatus = PostStatus.PUBLIC;
    private PostLocation postLocation;
    @OneToMany(mappedBy = "post",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Comment> comments = new ArrayList<>();
    public enum PostStatus{
        PUBLIC, PRIVATE, DELETE
    }
    public enum PostLocation{
        FREE,PROMISE,TOFRIEND,LUNCHRECOMMEND,PROPOSAL
    }
}
