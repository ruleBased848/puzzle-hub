package com.rulebased848.puzzlehub.repository;

import com.rulebased848.puzzlehub.domain.Puzzle;
import org.springframework.data.repository.CrudRepository;

public interface PuzzleRepository extends CrudRepository<Puzzle,Long> {
}