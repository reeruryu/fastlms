package com.zerobase.fastlms.member.repository;

import com.zerobase.fastlms.member.entity.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
    List<LoginHistory> findAllByUserIdOrderByLoginDtDesc(String userId);
    Optional<LoginHistory> findFirstByUserIdOrderByLoginDtDesc(String userId);

}
