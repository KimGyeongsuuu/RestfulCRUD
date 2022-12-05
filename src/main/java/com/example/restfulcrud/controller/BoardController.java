package com.example.restfulcrud.controller;

import com.example.restfulcrud.entity.Board;
import com.example.restfulcrud.dto.RequestDto;
import com.example.restfulcrud.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/write")
    public void write(@RequestBody RequestDto requestDto){
        boardService.write(requestDto);
    }
    @GetMapping
    public List<Board> boardList(){
        return boardService.list();
    }
    @GetMapping("/{boardId}")
    public Optional<Board> findById(@PathVariable Integer boardId){
        return boardService.findById(boardId);
    }
    @DeleteMapping("/delete/{boardId}")
    public void deleteById(@PathVariable Integer boardId){
        boardService.deleteById(boardId);
    }
    @DeleteMapping("/delete/All")
    public void delete(){
        boardService.delete();
    }

    @PatchMapping("update/{boardId}")
    public void update(@PathVariable Integer boardId, @RequestBody RequestDto requestDto){
        boardService.update(boardId,requestDto);
    }



}
