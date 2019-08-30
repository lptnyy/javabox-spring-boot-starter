package com.javabox.spring.boot.autoconfigure.log;

import com.javabox.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// log manage
public class BoxLogImpl implements Log {

    Logger logger = LoggerFactory.getLogger(BoxLogImpl.class);

    @Override
    public void info(String message) {
        logger.info(message);
    }

    @Override
    public void info(Exception e) {
        logger.info(e.getMessage());
    }

    @Override
    public void debug(String message) {
        logger.debug(message);
    }

    @Override
    public void debug(Exception e) {
        logger.debug(e.getMessage());
    }

    @Override
    public void warr(String message) {
        logger.warn(message);
    }

    @Override
    public void warr(Exception e) {
        logger.warn(e.getMessage());
    }

    @Override
    public void error(String message) {
        logger.error(message);
    }

    @Override
    public void error(Exception e) {
        logger.error(e.getMessage());
    }
}
