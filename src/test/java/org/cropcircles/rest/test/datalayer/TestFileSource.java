package org.cropcircles.rest.test.datalayer;

import org.cropcircles.rest.datalayer.CSVFileSource;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author Dante-666
 * @version 1.0.0
 */
public class TestFileSource {

    String path="src/main/resources/FileSource/csv.csv";

    @Test(groups = {"CSV"})
    public void csvFileTest() throws IOException {
        CSVFileSource cfs= new CSVFileSource(path);
        System.out.println(cfs.fetchData());
    }

}
