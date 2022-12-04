package com.example.restfulcrud.dto;


import com.example.restfulcrud.Entity.Board;
import lombok.*;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTO {
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .build();
    }
}
