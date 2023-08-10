package kimchinge.demo.member.entity;

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
public class Member extends Auditable {

    @Id
    @GeneratedValue
    private long memberId;

    private String username;

    private String password;
    private String introduction;
    private String profileImage;
    private MemberStatus memberStatus = MemberStatus.ACTIVE;//만들기
    public enum MemberStatus {
    ACTIVE, REST, DELETE
    }
}
