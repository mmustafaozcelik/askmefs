package com.mmustafa.askme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmustafa.askme.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{

}
