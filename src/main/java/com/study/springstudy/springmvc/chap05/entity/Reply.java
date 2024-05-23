package com.study.springstudy.springmvc.chap05.entity;

/*
    -- 댓글 테이블 생성
    CREATE TABLE tbl_reply (
        reply_no INT (8) PRIMARY KEY auto_increment,
        reply_text VARCHAR(1000) NOT NULL,
        reply_writer VARCHAR(100) NOT NULL,
        reply_date DATETIME default current_timestamp,
        board_no INT(8),
        constraint fk_reply
        foreign key (board_no)
        references tbl_board (board_no)
        on delete cascade
);

 */


import lombok.*;

import java.time.LocalDateTime;
// setter 안하는 이유 : 데이터베이스 데이터라서 변동성을 두지 않기위해 / 만약 필요하다면 댓글의 내용정도? 수정할일 있으니까
@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reply {

    private long replyNo;
    @Setter
    private String replyText;
    private String replyWriter;
    private LocalDateTime replyDate;
    private long boardNo;

}
