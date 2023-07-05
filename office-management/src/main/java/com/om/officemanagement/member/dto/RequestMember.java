package com.om.officemanagement.member.dto;

import com.om.officemanagement.member.entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * packageName    : com.om.officemanagement.member.dto
 * fileName       : RequestMember
 * author         : juhyub
 * date           : 2023/07/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/07/05        juhyub       최초 생성
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RequestMember {

    @NotBlank(message = "이름을 입력해주세요.")
    private String name;        //-- 이름
    @NotBlank(message = "이메일을 입력해주세요.")
    private String email;       //-- 이메일
    private String nickname;    //-- 닉네임
    private Integer age;        //-- 나이
    private Date birthday;      //-- 생년월일

    public MemberEntity toEntity() {
        return MemberEntity.builder()
                .name(name)
                .email(email)
                .nickname(nickname)
                .age(age)
                .birthday(birthday)
                .build();
    }
}
