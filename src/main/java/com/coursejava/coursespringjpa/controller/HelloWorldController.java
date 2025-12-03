package com.coursejava.coursespringjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController //combina as anotacoes de controller e responsebody
//@RequestMapping("/hello-world") //mapeia os endpoints ("/hello-world") qual endpoint quer mapeiar;
public class HelloWorldController {

    /* qual metodo HTTP esse metodo escuta?
       post, get, delete, put, patch, options, head;

       post, get;

       se quisermos adicionar mais um path no endpoint basta passar um parametro no mapeiamento;
       @GetMapping("/get");

       resultado: GET /hello-world/get


        stop video at 24:00 fernanda Kipper spring para iniciantes;
     */
//    @GetMapping
//    public String helloWorld(){
//        return "hello world";
//    }
}
