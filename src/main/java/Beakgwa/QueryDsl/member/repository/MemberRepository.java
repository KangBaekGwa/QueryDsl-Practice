package Beakgwa.QueryDsl.member.repository;

import Beakgwa.QueryDsl.member.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Members, Long> {
}
