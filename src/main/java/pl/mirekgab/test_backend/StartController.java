package pl.mirekgab.test_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/")
    public String hello() {
        return "hello world from version 0.2.0";
    }

    @GetMapping("/mytext")
    public String mytext() {
        return "this is my text";
    }
}
