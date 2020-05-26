package org.mvnsearch.mysql8demo;

import com.mysql.cj.xdevapi.Session;
import com.mysql.cj.xdevapi.SqlResult;
import com.mysql.cj.xdevapi.SqlStatement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * Xdev API test
 *
 * @author linux_china
 */
public class XdevApiTest extends BaseTest {
    @Autowired
    private Session session;

    @Test
    public void testQuery() throws Exception {
        SqlStatement statement = session.sql("select * from account");
        CompletableFuture<SqlResult> future = statement.executeAsync();
        Mono.fromFuture(future).flatMapMany(rows -> {
            return Flux.fromIterable(rows.fetchAll());
        }).subscribe(row -> {
            System.out.println(row.getString("nick"));
        });
        Thread.sleep(2000);
    }
}
