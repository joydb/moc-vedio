package com.dbstudy.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@Service
@WebListener
public class MainListener implements ServletRequestListener {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.info("Request listener 方法初始化。。。");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.info("Request listener 方法初销毁。。。");
    }
}
