package com.afterschool.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afterschool.entity.ChatEntity;
public interface ChatRepository extends JpaRepository<ChatEntity,Long>{

}
