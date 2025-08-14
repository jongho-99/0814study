package com.kh.app01.member.repository;

import com.kh.app01.member.dto.ReqMemberDto;
import com.kh.app01.member.entity.MemberEntity;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;
    public void join(MemberEntity entity) {
        em.persist(entity);
    }

    public MemberEntity login(ReqMemberDto dto) {

        String inputId = dto.getUserId();
        String inputPwd = dto.getUserPwd();

        String jpql = "SELECT m FROM MemberEntity m WHERE m.userId = :inputId AND m.userPwd = :inputPwd";

        return em.createQuery(jpql, MemberEntity.class)
                .setParameter("inputId", inputId)
                .setParameter("inputPwd", inputPwd)
                .getSingleResult();
    }

}
