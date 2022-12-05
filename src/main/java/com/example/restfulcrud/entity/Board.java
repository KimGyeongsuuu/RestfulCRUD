package com.example.restfulcrud.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="boardId")
    private Integer boardId;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    public void updateTitle(String title){
        this.title = title;
    }
    public void updateContent(String content){
        this.content = content;
    }

}