package com.example.DiaryApp.Repository;

import com.example.DiaryApp.Model.DailyHustle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DailyHustleRepo extends MongoRepository<DailyHustle,Integer> {
}
