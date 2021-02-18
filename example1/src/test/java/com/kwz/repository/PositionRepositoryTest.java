package com.kwz.repository;

import com.kwz.AppApplication;
import com.kwz.entity.Position;
import com.kwz.entity.PositionDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Description
 * Date 2021/2/18 22:42
 * Created by kwz
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppApplication.class)
public class PositionRepositoryTest {

    @Resource
    private PositionRepository positionRepository;

    @Resource
    private PositionDetailRepository positionDetailRepository;

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

            PositionDetail positionDetail = new PositionDetail();
            positionDetail.setPId(position.getId());
            positionDetail.setDescription("this is position detail description");
            positionDetailRepository.save(positionDetail);
        }
    }


}