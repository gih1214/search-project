package site.metacoding.serch.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends JpaRepository<BoardTbl, Integer> {

    @Query(value = "SELECT * FROM boardTbl WHERE  title like %:keyword%", nativeQuery = true)
    List<BoardTbl> mSearch(@Param("keyword") String keyword);
}
