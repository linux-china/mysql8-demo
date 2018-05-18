package org.mvnsearch.mysql8demo;

import com.mysql.cj.xdevapi.Collection;
import com.mysql.cj.xdevapi.Schema;
import com.mysql.cj.xdevapi.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MySQL 8 auto configuration
 *
 * @author linux_china
 */
@Configuration
public class MySQLAutoConfiguration {

    @Bean(destroyMethod = "close")
    public Session mysqlSession(@Value("${spring.mysqlx.url}") String mysqlxUrl) {
        return new SessionFactory().getSession(mysqlxUrl);
    }

    @Bean
    public Collection countryInfo(Session mysqlSession) {
        Schema schema = mysqlSession.getDefaultSchema();
        return schema.getCollection("countryinfo");
    }
}
