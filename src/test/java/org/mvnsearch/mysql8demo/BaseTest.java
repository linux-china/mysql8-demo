package org.mvnsearch.mysql8demo;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.spring.api.DBRider;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * base test
 *
 * @author linux_china
 */
@SpringJUnitConfig(Mysql8DemoApplication.class)
@SpringBootTest
@ActiveProfiles("test")
@DBRider
@DBUnit(schema = "demo")
public abstract class BaseTest {
}
