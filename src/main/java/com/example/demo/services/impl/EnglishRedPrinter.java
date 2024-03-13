package com.example.demo.services.impl;

import com.example.demo.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "red printer brrr";
    }
}
