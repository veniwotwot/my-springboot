package com.bby.myspringboot.service;

import com.bby.myspringboot.entity.Human;
import com.bby.myspringboot.repository.HumanRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanServiceImpl implements HumanService{

    @Autowired
    private HumanRepository humanRepository;

    public Human saveHuman(Human human){
        return humanRepository.save(human);
    }

    @Override
    public List<Human> fetchHumanList(){
        return (List<Human>) humanRepository.findAll();
    }

    @Override
    public Human updateHuman(Human human, Long id )
    {
        Human humanDB
                = humanRepository.findById(id).get();

        if (Objects.nonNull(human.getFname()) && !"".equalsIgnoreCase(human.getFname())) {
            humanDB.setFname(human.getFname());
        }

        if (Objects.nonNull(human.getLname()) && !"".equalsIgnoreCase(human.getLname())) {
            humanDB.setLname(human.getLname());
        }

        if (Objects.nonNull(human.getAge()) && !"".equals(human.getAge())) {
            humanDB.setAge(human.getAge());
        }

        if (Objects.nonNull(human.getWeight_lb()) && !"".equals(human.getWeight_lb())) {
            humanDB.setWeight_lb(human.getWeight_lb());
        }

        if (Objects.nonNull(human.getHeight_inch()) && !"".equals(human.getHeight_inch())) {
            humanDB.setHeight_inch(human.getHeight_inch());
        }

        return humanRepository.save(humanDB);
    }

    @Override
    public void deleteHuman(Long id){
        humanRepository.deleteById(id);
    }
}
