package org.cropcircles.rest.controller;

import org.cropcircles.rest.datalayer.CSVFileSource;
import org.cropcircles.rest.datalayer.DataSourceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author Dante-666
 * @version 1.0.0
 */

@RestController
public class CropCirclesController {
    private static final Logger logger = LoggerFactory.getLogger(CropCirclesController.class);

    DataSourceInterface ds;

    /**
     * This method returns a dummy string, purely for initial testing phase and
     * will be removed later.
     *
     * @return A dummy string object
     * @deprecated
     */

    @RequestMapping(value = CCRestURIConstants.DUMMY_DATA, method = RequestMethod.GET, produces = "text/plain")
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    String getDummyEmployee() {

        logger.info("Initiating dummy test String...");

        return "Hello";
    }
    @RequestMapping(value = CCRestURIConstants.GET_DATA, method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    ResponseEntity<Object> getEmployee() throws IOException {

        logger.info("Initiating test...");

        ds = new CSVFileSource("C:\\Program Files\\Apache Software Foundation\\Tomcat 7.0\\webapps\\CropCircles\\WEB-INF\\classes\\FileSource\\csv.csv");

        return new ResponseEntity<>(ds.fetchData(), HttpStatus.OK);
    }
}
