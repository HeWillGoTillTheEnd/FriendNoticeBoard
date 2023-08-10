package kimchinge.demo.image.entity;

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
public class Image extends Auditable {
    @Id
    @GeneratedValue
    private long imageId;

    private String imageKey;

    private Long postId;

}
