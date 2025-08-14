package com.kh.app01.board.repository;

import com.kh.app01.board.entity.BoardEntity;
import com.kh.app01.notice.entity.NoticeEntity;
import jakarta.persistence.EntityManager;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    private final EntityManager em;

    public void insert(BoardEntity entity) {
        em.persist(entity);
    }

    public List<BoardEntity> list() {

        return em.createQuery("SELECT b FROM BoardEntity b WHERE b.delYn = 'N' ORDER BY b.no DESC", BoardEntity.class).getResultList();
    }

    public BoardEntity getOneByNo(long no) {
        return em.find(BoardEntity.class, no);

    }
}
