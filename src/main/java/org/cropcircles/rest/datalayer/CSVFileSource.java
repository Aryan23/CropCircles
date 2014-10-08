package org.cropcircles.rest.datalayer;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Dante-666
 * @version 1.0.0
 */
public final class CSVFileSource extends AbstractFileSource {

    public CSVFileSource(String conn){
        open(conn);
    }

    @Override
    public Object fetchData() throws IOException {
        CSVParser parser = CSVParser.parse(in, StandardCharsets.US_ASCII, CSVFormat.DEFAULT);
/*        for (CSVRecord csvRecord : parser)
            return csvRecord.toString();
        return null;*/
        return parser;
    }
}
