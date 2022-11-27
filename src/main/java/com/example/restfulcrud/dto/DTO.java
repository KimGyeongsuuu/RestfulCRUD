package com.example.restfulcrud.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DTO {
    private String boardId;
    private String title;
    private String content;
}
