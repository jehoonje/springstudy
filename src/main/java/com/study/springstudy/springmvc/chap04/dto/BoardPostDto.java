package com.study.springstudy.springmvc.chap04.dto;

import com.study.springstudy.springmvc.chap04.entity.Board;

public class BoardPostDto {
    private int boardNo;
    private String writer;
    private String title;
    private String content; // 내용

    public BoardPostDto(int boardNo, String writer, String title, String content) {
        this.boardNo = boardNo;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoardPostDto{" +
                "boardNo=" + boardNo +
                ", writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    public Board toEntity() {
        Board b = new Board();
        b.setContent(this.content);
        b.setWriter(this.writer);
        b.setTitle(this.title);
        return b;
    }
}
