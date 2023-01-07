package com.rulebased848.puzzlehub.repository;

import com.rulebased848.puzzlehub.domain.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    Optional<User> findByUsername(String username);
}