package com.example.restfulcrud.dto;


import com.example.restfulcrud.entity.Board;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    private String title;
    private String content;

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .build();
    }
}
