package com.example.restfulcrud.controller;

import com.example.restfulcrud.dto.DTO;
import com.example.restfulcrud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/board")
public class BoardController {


    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public DTO write(@RequestBody DTO board){
        return boardService.write(board);
    }

    @GetMapping()
    public List<DTO> read(){
        return boardService.list();
    }

    @DeleteMapping("/delete/{boardId}")
    public void delete(@PathVariable String boardId){
        boardService.delete(boardId);
    }

    @GetMapping("/{boardId}")
    public DTO readById(@PathVariable String boardId){
        return boardService.readById(boardId);
    }

}
