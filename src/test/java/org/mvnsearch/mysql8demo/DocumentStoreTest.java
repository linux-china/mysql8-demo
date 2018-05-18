package org.mvnsearch.mysql8demo;

import com.mysql.cj.xdevapi.Collection;
import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.JsonNumber;
import com.mysql.cj.xdevapi.JsonString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Document Store test
 *
 * @author linux_china
 */
public class DocumentStoreTest extends BaseTest {
    @Autowired
    private Collection countryInfo;

    @Test
    public void testNoSQLOperation() throws Exception {
        DbDoc doc = countryInfo.newDoc();
        doc.put("_id", new JsonString().setValue("1"));
        doc.put("name", new JsonString().setValue("China"));
        doc.put("gdp", new JsonNumber().setValue("150"));
        countryInfo.addOrReplaceOne("1", doc);
    }

    @Test
    public void testFind() throws Exception {
        DbDoc doc = countryInfo.getOne("1");
        System.out.println(doc.get("name"));
    }

}
