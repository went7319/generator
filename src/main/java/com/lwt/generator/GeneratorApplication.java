package com.lwt.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneratorApplication {

    public static void main(String[] args) {
//        SpringApplication.run(GeneratorApplication.class, args);
        String s = System.getProperty("user.dir");
        int i = s.lastIndexOf('\\');
        System.out.println("i = " + i);
        String s1 = s.substring(0, s.lastIndexOf('\\'));
        System.out.println("s = " + s );
        System.out.println("s1 = " + s1);


    }

}
