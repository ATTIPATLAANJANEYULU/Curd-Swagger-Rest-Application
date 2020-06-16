package com.org.volvobus.repositary;

import com.org.volvobus.model.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepo extends MongoRepository<Bus, Integer> {
    //public void findBybusId(Integer busId);
    public String findBybusName(String busName);

    public void deleteBybusName(String busName);

}
