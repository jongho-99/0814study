package com.kh.app01.board.controller;

import com.kh.app01.board.entity.BoardEntity;
import com.kh.app01.board.service.BoardService;
import com.kh.app01.notice.entity.NoticeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/board")
@RequiredArgsConstructor

public class BoardApiController {

    private final BoardService boardService;

    @PostMapping
    private void insert(@RequestBody BoardEntity entity) {
        boardService.insert(entity);
    }

    @GetMapping
    private List<BoardEntity> list() {
        return boardService.list();
    }

    @GetMapping("{no}")
    private BoardEntity getOneByNo(@PathVariable long no) {
        return boardService.getOneByNo(no);
    }

    @PutMapping
    private void updateBoard(@RequestBody BoardEntity vo) {
        boardService.updateBoard(vo);
    }
}
