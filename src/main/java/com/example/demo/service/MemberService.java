package com.example.demo.service;

import com.example.demo.domain.Member;

public interface MemberService {

    // 회원가입 시 멤버 저장
    void save(Member member);

    // 로그인 시 멤버 조회
    void findMember(Member member);
}
