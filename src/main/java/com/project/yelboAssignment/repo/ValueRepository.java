package com.project.yelboAssignment.repo;

import com.project.yelboAssignment.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ValueRepository extends JpaRepository<Category, Long> {

    @Query("update Category c set c.value = :value where c.categoryCode = :categoryCode")
    int updateCategoryValue(@Param("categoryCode")int categoryCode, @Param("value")int value);

}
