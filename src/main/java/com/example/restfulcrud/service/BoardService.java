package com.example.restfulcrud.service;


import com.example.restfulcrud.dto.DTO;
import com.example.restfulcrud.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;


    public DTO write(DTO board){
        return boardRepository.write(board);
    }

    public List<DTO> list(){
        return boardRepository.list();
    }

    public void delete(String boardId){
        boardRepository.delete(boardId);
    }

    public DTO readById(String boardId){
        return boardRepository.readById(boardId);
    }


}
