package com.example.restfulcrud.service;


import com.example.restfulcrud.Entity.Board;
import com.example.restfulcrud.dto.DTO;
import com.example.restfulcrud.repository.BoardRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void write(DTO dto){
        boardRepository.save(dto.toEntity());
    }

    public List<Board> list(){
        return boardRepository.findAll();
    }


    public Optional<Board> findById(String boardId){
        return boardRepository.findById(boardId);
    }

    public void deleteById(String boardId){
        boardRepository.deleteById(boardId);
    }
    public void deleteAll(){
        boardRepository.deleteAll();
    }

    public void boardUpdate(String boardId, DTO dto){
        Optional<Board> updateBoard = boardRepository.findById(boardId);


    }


}
