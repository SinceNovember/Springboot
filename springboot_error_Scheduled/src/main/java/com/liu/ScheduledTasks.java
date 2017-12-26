package com.liu;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务实现类
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("现在时间为:"+dateFormat.format(new Date()));
    }
}
