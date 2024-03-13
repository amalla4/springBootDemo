package com.example.demo.services.impl;

import com.example.demo.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print(){
        return "green printer brrr";
    }
}
