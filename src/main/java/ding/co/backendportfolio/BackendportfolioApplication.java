package ding.co.backendportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@SpringBootApplication
@EnableScheduling
public class BackendportfolioApplication {
    public static void main(String[] args) {

        // 커밋용추가
        System.out.println("다듣자");
        SpringApplication.run(BackendportfolioApplication.class, args);
    }

}
