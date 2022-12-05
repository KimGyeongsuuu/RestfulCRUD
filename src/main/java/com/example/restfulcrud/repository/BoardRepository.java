package com.example.restfulcrud.repository;


import com.example.restfulcrud.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
