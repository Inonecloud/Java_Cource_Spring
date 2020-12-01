package ru.digitalleague.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.demo.service.HelloService;
import ru.digitalleague.demo.service.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class HelloController {

    private HelloService helloService;
    private List<StudentDto> students = new ArrayList<>();

    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name){
        return helloService.helloSomething(name);
    }

    @PostMapping("add_student")
    public ResponseEntity<StudentDto>addStudent(@RequestBody StudentDto student){
        students.add(student);
        return new ResponseEntity<StudentDto>(HttpStatus.I_AM_A_TEAPOT);
    }
}
