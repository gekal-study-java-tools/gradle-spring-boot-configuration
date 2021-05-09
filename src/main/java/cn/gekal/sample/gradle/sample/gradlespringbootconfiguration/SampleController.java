package cn.gekal.sample.gradle.sample.gradlespringbootconfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

    @GetMapping
    public String sample() {

        return "hello world!";
    }
}
