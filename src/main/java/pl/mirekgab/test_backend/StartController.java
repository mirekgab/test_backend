package pl.mirekgab.test_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/")
    public String hello() {
        return "hello world from version 0.3.0";
    }

    @GetMapping("/mytext")
    public String mytext() {
        return "this is my text";
    }

    @GetMapping("/hello")
    public String hello1() {
        return "hello1";
    }
}
