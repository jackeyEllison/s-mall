package cn.bugstack.web.test.web;

import com.google.common.eventbus.EventBus;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description
 * @create 2024-08-02 07:12
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class EventBusTest {

    @Resource
    private EventBus eventBus;

    @Test
    public void test() throws InterruptedException {
        eventBus.post("xxxxx");

        new CountDownLatch(1).await();
    }

}
