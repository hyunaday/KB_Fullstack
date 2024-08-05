package org.scoula;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

//@WebAppConfiguration : 웹어플리케이션 컨텍스트 설정(구동이 되지 않을 때 추가해주기 (비상용))
@ExtendWith(SpringExtension.class) // Spring 테스트를 위해 확장 기능 사용
@ContextConfiguration(classes = {RootConfig.class}) // Spring Context를 가져올 설정 클래스 지정
@Log4j // log4j.xml을 사용해서 log 기능 가져오기
class RestaurantTest {

    @Autowired
    private Restaurant restaurant;

    @Test
    void getChef() {
        // restaurant가 객체가 null이 아님을 확인하는 메소드
        assertNotNull(restaurant); // static이므로 객체를 불러오지 않고 사용 가능
        log.info(restaurant);
        log.info("-------------------------");
        log.info(restaurant.getChef());
    }
}