package com.study.springstudy.springmvc.chap04.service;

import com.study.springstudy.springmvc.chap04.mapper.BoardMapper;
import com.study.springstudy.springmvc.chap04.dto.*;
import com.study.springstudy.springmvc.chap04.entity.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardMapper repository;

    public List<BoardListResponseDto> getList() {
        List<Board> boardList = repository.findAll();
        return  boardList.stream()
                .map(BoardListResponseDto::new)
                .collect(Collectors.toList());

    }
    // 삭제 중간처리
    public boolean delete(int boardNo) {
        return repository.delete(boardNo);
    }

    public boolean save(Board b) {
        return repository.save(b);
    }

    public Board findOne(int bno) {
        return repository.findOne(bno);
    }

    public void upViewCount(int bno) {

    }
}
