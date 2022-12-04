package com.example.restfulcrud.repository;


import com.example.restfulcrud.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, String> {
}
