package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
/* 자동으로 AspectJ 라이브러리를 이용해서 Proxy 객체를 생성해 내는 용도로 사용*/
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DevProjectApplication {

       public static void main(String[] args) {
              SpringApplication.run(DevProjectApplication.class, args);
       }

}