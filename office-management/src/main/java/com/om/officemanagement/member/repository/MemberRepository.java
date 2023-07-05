package com.om.officemanagement.member.repository;

import com.om.officemanagement.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.om.officemanagement.member.repository
 * fileName       : MemberRepository
 * author         : juhyub
 * date           : 2023/07/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/07/05        juhyub       최초 생성
 */

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> { //-- JpaRepository를 상속하여 사용. <객체, ID>
}
