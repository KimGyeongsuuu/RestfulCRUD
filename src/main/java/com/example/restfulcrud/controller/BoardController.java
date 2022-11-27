package com.example.restfulcrud.controller;

import com.example.restfulcrud.dto.DTO;
import com.example.restfulcrud.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/board")

public class BoardController {

    // CRUD
    // C -> CREATE(write)
    // R -> READ(read)
    // U -> UPDATE(
    // D -> DELETE
    //
    //
    //

    private BoardService boardService;


    @PostMapping("/write")
    public DTO write(DTO board){
        return boardService.write(board);
    }

    @GetMapping()
    public List<DTO> read(){
        return boardService.list();
    }

    @DeleteMapping("/delete")
    public void delete(String boardId){
        boardService.delete(boardId);
    }

}
