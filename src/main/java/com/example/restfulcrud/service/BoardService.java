package com.example.restfulcrud.service;


import com.example.restfulcrud.entity.Board;
import com.example.restfulcrud.dto.RequestDto;
import com.example.restfulcrud.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void write(RequestDto requestDto){
        boardRepository.save(requestDto.toEntity());
    }
    public List<Board> list(){
        return boardRepository.findAll();
    }
    public Optional<Board> findById(Integer boardId){
        return boardRepository.findById(boardId);
    }
    public void deleteById(Integer boardId){
        boardRepository.deleteById(boardId);
    }
    public void delete(){
        boardRepository.deleteAll();
    }
    public void update(Integer boardId, RequestDto requestDto){
        Optional<Board> updateBoard = boardRepository.findById(boardId);
        updateBoard.get().updateTitle(requestDto.getTitle());
        updateBoard.get().updateContent(requestDto.getContent());
        boardRepository.save(updateBoard.get());
    }
}
