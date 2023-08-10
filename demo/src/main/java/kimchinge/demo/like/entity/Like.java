package kimchinge.demo.like.entity;

import kimchinge.demo.audit.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Like extends Auditable {

    @Id
    @GeneratedValue
    private long likeId;

    private boolean likes;
    private long memberId;
    private Long postId;
}
