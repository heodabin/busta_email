package holdingham.example.busta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    private String authKey;
    private boolean isAuthenticated;

    // 생성자, 게터, 세터 등 필요한 메서드 추가
}

