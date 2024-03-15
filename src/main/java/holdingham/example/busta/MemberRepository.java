package holdingham.example.busta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    // 사용자명으로 회원 조회
    Member findByUsername(String username);

    // 이메일로 회원 조회
    Member findByEmail(String email);
}

