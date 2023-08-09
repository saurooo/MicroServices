package com.programming.hotel.repository;

import com.programming.hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface HotelRepository extends JpaRepository<Hotel,String> {
}
