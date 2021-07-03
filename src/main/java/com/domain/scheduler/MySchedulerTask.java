package com.domain.scheduler;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
// @EnableAsync
public class MySchedulerTask {

    // setiap 1 detik akan menjalankan task, tetapi harus memastikan bahwa task
    // sebelumnya sudah selesai
    // @Scheduled(fixedDelay = 1000, initialDelay = 2000)
    @Scheduled(cron = "0 * * ? * *")
    // setiap 1 detik akan menjalankan task tanpa menunggu task sebelumnya
    // @Async
    // @Scheduled(fixedRate = 1000)
    public void myFirstTask() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Task Executed at " + sdf.format(System.currentTimeMillis()));
        // Thread.sleep(10000);
    }
}
