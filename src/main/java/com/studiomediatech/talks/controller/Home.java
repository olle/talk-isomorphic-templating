package com.studiomediatech.talks.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;


@Controller
public class Home {

    @RequestMapping(value = "/")
    public ModelAndView displayHome(Model model) {

        model.addAttribute("greeting", "Hello from Mustache!");

        Person ruby = new Person("Ruby Heckler", 32);
        Person bernhard = new Person("Bernhard Klein", 55);
        Person trogdor = new Person("Trogdor", 3221);

        model.addAttribute("items", Arrays.asList(ruby, bernhard, trogdor));

        return new ModelAndView("index", model.asMap());
    }

    public static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {

            this.name = name;
            this.age = age;
        }

        public int getAge() {

            return age;
        }


        public void setAge(int age) {

            this.age = age;
        }


        public String getName() {

            return name;
        }


        public void setName(String name) {

            this.name = name;
        }
    }
}
