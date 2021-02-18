package com.kwz.repository;

import com.kwz.AppApplication;
import com.kwz.entity.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description
 * Date 2021/2/18 22:42
 * Created by kwz
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppApplication.class)
public class PositionRepositoryTest {

    @Autowired
    private PositionRepository positionRepository;

    @Test
    public void testAdd() {
        for (int i = 0; i < 100; i++) {
            Position position = new Position();
            position.setId(i);
            position.setName("position" + i);
            position.setCity("beijing");
            position.setSalary("20w");
            positionRepository.save(position);
        }
    }

    @Test
    public void testInnerId() {
        for (int i = 0; i < 100; i++) {
            Position position = new Position();
            position.setName("position" + i);
            position.setCity("beijing");
            position.setSalary("20w");
            positionRepository.save(position);
        }
    }


}