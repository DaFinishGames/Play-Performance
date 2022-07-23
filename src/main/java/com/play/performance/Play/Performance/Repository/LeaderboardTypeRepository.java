package com.play.performance.Play.Performance.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.play.performance.Play.Performance.DataObjects.LeaderboardType;

public interface LeaderboardTypeRepository extends PlayPerformanceRepository<LeaderboardType, Long> {

}
