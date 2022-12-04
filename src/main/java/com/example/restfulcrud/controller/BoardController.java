package com.example.restfulcrud.controller;

import com.example.restfulcrud.Entity.Board;
import com.example.restfulcrud.dto.DTO;
import com.example.restfulcrud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {


    private final BoardService boardService;


    // 쓰기
    @PostMapping("/write")
    public void write(@RequestBody DTO dto){
        boardService.write(dto);
    }

    // 모든 글 보기
    @GetMapping()
    public List<Board> boardList(){
        return boardService.list();
    }

    // 아이디를 입력하고 글 보기
    @GetMapping("/{boardId}")
    public Optional<Board> findById(@PathVariable String boardId){
        return boardService.findById(boardId);
    }

    // 아이디를 받고 해당 글 지우기
    @DeleteMapping("/delete/{boardId}")
    public void deleteById(@PathVariable String boardId){
        boardService.deleteById(boardId);
    }

    // 모두 지우기
    @DeleteMapping("/delete/All")
    public void deleteAll(){
        boardService.deleteAll();
    }

    /*
    // 아이디를 받고 수정하기

    @PatchMapping("/update/{boardId}")
    public void update(@PathVariable String boardId, @RequestBody DTO dto){
        boardService.boardUpdate(boardId,dto);
    }
     */


}
