package com.bby.myspringboot.service;
import com.bby.myspringboot.entity.Human;
import java.util.List;

public interface HumanService {
    Human saveHuman(Human human);

    List<Human> fetchHumanList();

    Human updateHuman(Human human, Long id);

    void deleteHuman(Long id);
}
