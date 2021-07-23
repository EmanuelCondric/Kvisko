//package com.backend.appbackend.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.backend.appbackend.model.User;
//
//public interface UserRepository extends JpaRepository<User,Integer> {
//	
//	public User findUserIdByEmail(String email);
//	
//	public User findUserIdByUsernameAndPassword(String username, String password);
//}

package com.backend.appbackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.appbackend.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	
	User findUserIdByEmail(String email);
	
	User findUserIdByUsernameAndPassword(String username, String password);
}