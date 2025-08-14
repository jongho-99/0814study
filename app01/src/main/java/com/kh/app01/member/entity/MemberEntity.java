package com.kh.app01.member.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="MEMBER")
@SequenceGenerator(name="member_seq_gen", sequenceName = "SEQ_MEMBER", allocationSize = 1)
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_gen")
    private long no;
    private String userId;
    private String userPwd;
    private String userNick;
    private LocalDateTime createAt;
    private String delYn;

    public MemberEntity() {
        createAt = LocalDateTime.now();
        delYn = "N";
    }
}
