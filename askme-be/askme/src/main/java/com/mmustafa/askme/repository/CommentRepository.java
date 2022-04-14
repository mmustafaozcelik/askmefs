package com.mmustafa.askme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmustafa.askme.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
