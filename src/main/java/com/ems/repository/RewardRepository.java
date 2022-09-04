package com.ems.repository;

import com.ems.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface RewardRepository extends JpaRepository<Reward,Long> {



    @Query("Select r.amount from Reward r Inner join Employee e on (e.id = r.employee.id) where (e.id = :id)")
    Double GetRewardByEmployeeId(Long id);

    @Query("Select r.addedDate from Reward r Inner join Employee e on (e.id = r.employee.id) where (e.id = :id)")
    Date GetAddedDateByEmployeeId(Long id);

    @Query("Select r.expireDate from Reward r Inner join Employee e on (e.id = r.employee.id) where (e.id = :id)")
    Date GetExpireDateByEmployeeId(Long id);


}
