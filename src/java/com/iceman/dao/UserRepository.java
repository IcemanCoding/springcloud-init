package com.iceman.dao;

import com.iceman.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Iceman
 * 2018/12/27
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
