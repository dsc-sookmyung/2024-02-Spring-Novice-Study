package com.jojoldu.book.springboot.domain.posts;


import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Entity 클래스에서는 클래스의 인스턴스 값들의 변화를 구분하기 어렵기에 Setter 메소드를 절대 만들지 않음.
@Getter             // 아래 2개는 lombok의 어노테이션
@NoArgsConstructor
@Entity   // JPA의 어노테이션
// Posts가 BaseTimeEntity를 상속받도록 변경함.
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // update 함수 추가
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

