package com.kh.app01.board.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Data
@Table(name = "BOARD")
@SequenceGenerator(name = "board_seq_gen", sequenceName = "SEQ_BOARD", allocationSize = 1)
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq_gen")
    private long no;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String delYn;

    public BoardEntity() {
        createdAt = LocalDateTime.now();
        delYn = "N";
    }



}
