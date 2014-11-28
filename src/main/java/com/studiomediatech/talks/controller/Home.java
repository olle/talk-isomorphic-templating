package com.studiomediatech.talks.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Home {

    @RequestMapping(value = "/")
    public String displayHome(Model model) {

        return "index";
    }
}
