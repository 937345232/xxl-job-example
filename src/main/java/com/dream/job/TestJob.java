package com.dream.job;

import com.dream.service.UserService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jzx
 * @email: jiazhaoxin@ule.com
 * @Date: 2019-05-06 15:30
 */
@Component
@JobHandler(value = "firstJobHandler")
public class TestJob extends IJobHandler {

    Logger logger = LoggerFactory.getLogger(TestJob.class);

    @Autowired
    private UserService userService;

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        logger.info("job begin.................");
        XxlJobLogger.log("222222222222222222222222222222222222");
//        XxlJobLogger.log("1111111111111111111");
        userService.getString( s);

        return new ReturnT("install success");

    }
}
