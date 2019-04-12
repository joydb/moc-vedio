package com.dbstudy.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Service
@WebListener
public class IndexLintener implements ServletContextListener {

    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("Context listener 方法初始化。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("Context listener 方法销毁。。。");
    }
}
