package com.kh.app01.board.service;

import com.kh.app01.board.controller.BoardApiController;
import com.kh.app01.board.entity.BoardEntity;
import com.kh.app01.board.repository.BoardRepository;
import com.kh.app01.notice.entity.NoticeEntity;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.SQLInsert;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void insert(BoardEntity entity) {
        boardRepository.insert(entity);

    }

    public List<BoardEntity> list() {
        return boardRepository.list();
    }

    public BoardEntity getOneByNo(long no) {
        return boardRepository.getOneByNo(no);
    }

    public void updateBoard(BoardEntity vo) {

          BoardEntity entity =  boardRepository.getOneByNo(vo.getNo());
          entity.setTitle(vo.getTitle());
          entity.setContent((vo.getContent()));

    }
}
