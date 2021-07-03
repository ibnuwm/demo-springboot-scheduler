# demo-springboot-scheduler

- syarat scheduler : method harus void dan tidak ada parameter

Anotasi :

- @EnableScheduling di DemoSpringbootScheduler
- @Component di MySchedulerTask
- @Scheduled(cron = "0 \* _ ? _ \*") -> untuk menjalankan scheduler yg paling umum
  https://www.freeformatter.com/cron-expression-generator-quartz.html
- @Scheduled(fixedDelay = 1000, initialDelay = 2000) -> untuk menjalankan task setelah selesai di ekseskusi task sebelumnya selama 1 detik dan di awal akan ada delay selama 2 detik
- @EnableAsync, @Async, @Scheduled(fixedRate = 1000) -> untuk menjalankan task tanpa harus menunggu ekseskusi task sebelumnya selesai di kerjakan selama 1 detik
