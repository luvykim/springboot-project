package com.example.springbootproject.domain.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "board")
public class BoardEntity extends TimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false, name = "writer")
    private String writer;

    @Column(length = 100, nullable = false, name = "title")
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false, name = "content")
    private String content;

    @Builder
    public BoardEntity(Long id, String title, String content, String writer){
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
