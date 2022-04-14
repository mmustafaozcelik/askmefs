package com.mmustafa.askme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmustafa.askme.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
