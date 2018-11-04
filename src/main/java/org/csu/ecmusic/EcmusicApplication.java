package org.csu.ecmusic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//设置扫描文件位置
@MapperScan("org.csu.ecmusic.persistence")

public class EcmusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcmusicApplication.class, args);
    }
}
