package com.example.restfulcrud.dto;


import com.example.restfulcrud.entity.Board;
import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    @NotEmpty
    private Integer boardId;
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;

    public Board toEntity(){
        return Board.builder()
                .boardId(boardId)
                .title(title)
                .content(content)
                .build();
    }
}
