package com.dbstudy.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Service
@WebListener
public class InfoListener implements HttpSessionListener {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("Session listener 方法初始化。。。");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("Session listener 方法销毁。。。");

    }
}
