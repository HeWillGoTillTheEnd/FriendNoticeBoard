package kimchinge.demo.comment.entity;

import kimchinge.demo.audit.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private Long commentId;

    private String body;
    private Long postId;
    private Long memberId;

    @ManyToOne
    @JoinColumn(name = "POST_ID")
    private Comment comment;
}
