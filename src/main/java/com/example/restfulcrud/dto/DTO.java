package com.example.restfulcrud.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class DTO {
    private String boardId;
    private String title;
    private String content;
}
