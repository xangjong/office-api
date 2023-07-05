package com.om.officemanagement.member.service;

import com.om.officemanagement.member.dto.RequestMember;
import com.om.officemanagement.member.entity.MemberEntity;
import com.om.officemanagement.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.om.officemanagement.member.service
 * fileName       : MemberService
 * author         : juhyub
 * date           : 2023/07/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/07/05        juhyub       최초 생성
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * Member 객체생성
     * @param requestVO RequestMember
     * @return MemberEntity
     */
    public MemberEntity createMember(RequestMember requestVO) {
        log.info("[createMember] Request Parameter Info : {}", requestVO);
        MemberEntity member = requestVO.toEntity();
        MemberEntity savedMember = memberRepository.save(member);  //-- JpaRepository 에서 제공하는 save() 함수
        log.info("[createMember] Response Parameter Info : {}", savedMember);
        return savedMember;
    }

}
