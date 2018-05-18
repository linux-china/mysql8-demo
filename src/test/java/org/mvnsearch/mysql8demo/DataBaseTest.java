package org.mvnsearch.mysql8demo;

import com.github.database.rider.core.api.dataset.DataSet;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.FileOutputStream;

/**
 * database test`
 *
 * @author linux_china
 */
public class DataBaseTest extends BaseTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @DataSet({"/db/dataset/account.xml"})
    public void testSpike() throws Exception {

    }

    @Test
    public void generateDTD() throws Exception {
        IDatabaseConnection connection = new DatabaseConnection(jdbcTemplate.getDataSource().getConnection());
        FlatDtdDataSet.write(connection.createDataSet(), new FileOutputStream("target/database.dtd"));
    }
}
