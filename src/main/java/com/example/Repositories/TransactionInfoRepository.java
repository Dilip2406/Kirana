package com.example.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Models.TransactionInfo;

@Repository
public interface TransactionInfoRepository extends JpaRepository<TransactionInfo,Integer>{
	

}
