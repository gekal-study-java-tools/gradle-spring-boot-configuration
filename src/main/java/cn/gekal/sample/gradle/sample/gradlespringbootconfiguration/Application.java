package cn.gekal.sample.gradle.sample.gradlespringbootconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * アプリケーション
 */
@SpringBootApplication
public class Application {

    /**
     * メイン
     *
     * @param args 引数
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
