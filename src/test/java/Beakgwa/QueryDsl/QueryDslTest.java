package Beakgwa.QueryDsl;

import Beakgwa.QueryDsl.member.entity.Members;
import Beakgwa.QueryDsl.member.repository.MemberRepository;
import Beakgwa.QueryDsl.team.entity.Team;
import Beakgwa.QueryDsl.team.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class QueryDslTest {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void 사용자_팀_등록_테스트(){
        Team teamA = Team
                .builder()
                .name("teamA")
                .teamColor("RED")
                .build();
        Team savedTeam = teamRepository.save(teamA);

        Members memberA = Members
                .builder()
                .age(10)
                .logindId("test_login_id")
                .name("MemberA")
                .password("test_login_pw")
                .team(teamA)
                .build();
        Members savedMemberA = memberRepository.save(memberA);

        Members memberB = Members
                .builder()
                .age(23)
                .logindId("test_login_id2")
                .name("MemberB")
                .password("test_login_pw2")
                .team(teamA)
                .build();
        Members savedMemberB = memberRepository.save(memberB);
    }
}
