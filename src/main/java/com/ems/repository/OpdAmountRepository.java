package com.ems.repository;

import com.ems.entity.OpdAmount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OpdAmountRepository extends JpaRepository<OpdAmount,Long> {

    @Query("select o.amount from OpdAmount  o inner join Employee  e on (e.id = o.employee.id) where (e.id = :id)")
    Double GetAmountByEmployeeId(Long id);

    @Query("select o.expireDate from OpdAmount o Inner join Employee e on (e.id = o.employee.id) where (e.id = :id)")
    Date GetExpireDateByEmployeeId(Long id);

}
