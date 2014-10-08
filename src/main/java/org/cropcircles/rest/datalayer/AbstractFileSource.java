package org.cropcircles.rest.datalayer;

import java.io.File;
import java.io.IOException;

/**
 * @author Dante-666
 * @version 1.0.0
 */
public abstract class AbstractFileSource implements DataSourceInterface {

    File in;

    /**
     * For file source, the connection string will be the path of the file.
     * This is a standalone version so we have to worry about the master-slave configuration
     * later.
     *
     * @param conn File's local path
     */
    @Override
    public void open(String conn) {
        in = new File(conn);
    }

    /**
     * Close the stream.
     */

    @Override
    public void close() throws IOException {
    }

    @Override
    abstract public Object fetchData() throws IOException;
}
