package org.cropcircles.rest.datalayer;

import java.io.IOException;

/**
 * @author Dante-666
 * @version 1.0.0
 */
public interface DataSourceInterface {
    void open(String conn) throws IOException;
    void close() throws IOException;
    Object fetchData() throws IOException;
}
