package com.example.restfulcrud.repository;


import com.example.restfulcrud.dto.DTO;
import com.example.restfulcrud.repository.BoardRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepository {

    static public ArrayList<DTO> board;

    static {
        board = new ArrayList<>();
        board.add(new DTO("1","title1","content1"));
        board.add(new DTO("2","title2","content2"));
        board.add(new DTO("3","title3","content3"));
    }


    // 글쓰기
    public DTO write(DTO Board){
        board.add(Board);
        return Board;
    }
    // 목록보기
    public List<DTO> list(){
        return board;
    }
    public void delete(String boardId){
        board.removeIf(DTO -> DTO.getBoardId().equals(boardId));
    }
}
