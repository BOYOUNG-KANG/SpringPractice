package hello.core.member;

public interface MemberRepository {

    void save(Member member);

    void save(Long memberId);

    Member findById(Long memberId);
}
