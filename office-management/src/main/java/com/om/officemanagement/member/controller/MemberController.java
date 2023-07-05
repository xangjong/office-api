package com.om.officemanagement.member.controller;

import com.om.officemanagement.member.dto.RequestMember;
import com.om.officemanagement.member.entity.MemberEntity;
import com.om.officemanagement.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.om.officemanagement.member.controller
 * fileName       : MemberController
 * author         : juhyub
 * date           : 2023/07/03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/07/03        juhyub       최초 생성
 */

@RequiredArgsConstructor
@RequestMapping("om/member")
@RestController
public class MemberController {

    private final MemberService memberService;

    /**
     * Member 객체생성
     * @param requestVO RequestMember
     * @return ResponseEntity<MemberEntity>
     */
    @RequestMapping("create")
    public ResponseEntity<MemberEntity> createMember(@RequestBody RequestMember requestVO) {
        MemberEntity savedMember = memberService.createMember(requestVO);
        return new ResponseEntity<>(savedMember, HttpStatus.OK);
    }
}
