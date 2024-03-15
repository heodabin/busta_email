package holdingham.example.busta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    // 회원 가입 기능
    public void signUp(MemberDTO memberDTO) {
        // 회원 정보 저장
        Member member = new Member();
        member.setUsername(memberDTO.getUsername());
        member.setEmail(memberDTO.getEmail());
        member.setPassword(memberDTO.getPassword());
        memberRepository.save(member);

        // 이메일로 인증키 전송
        String authKey = generateAuthKey();
        memberService.sendAuthKey(memberDTO.getEmail(), authKey);
    }

    // 회원 가입 인증키 전송
    public void sendAuthKey(String email, String authKey) {
        // 이메일로 인증키 전송 로직 구현
    }

    // 인증키 생성
    private String generateAuthKey() {
        // 인증키 생성 로직 구현
    }

    // 회원 가입 인증키 검증
    public boolean verifyAuthKey(String email, String authKey) {
        // 인증키 검증 로직 구현
    }

    // 회원 정보 수정 (인증키 업데이트)
    public void updateAuthKey(String email, String authKey) {
        // 회원 정보 업데이트 로직 구현
    }

    // 회원 상태 업데이트 (인증 상태 업데이트)
    public void updateAuthStatus(String email, boolean isAuthenticated) {
        // 회원 상태 업데이트 로직 구현
    }
}


