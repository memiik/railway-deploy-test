package memiik.me.railwaydeploytest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {

    @GetMapping("/hello")
    public ResponseEntity<String> demo() {
        return new ResponseEntity<>("Hello from demo controller", HttpStatus.OK);
    }
}
