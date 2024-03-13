package com.example.demo.config;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColorPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;
import com.example.demo.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//label config class with @Configuration
//so when we start the app, its going to look for the conifg files and create the beans

@Configuration
public class PrinterConfig {
//    @Bean
//    public BluePrinter bluePrinter() {
//        return new EnglishBluePrinter();
//    }
//    @Bean
//    public RedPrinter redPrinter(){
//        return new EnglishRedPrinter();
//    }
//    @Bean
//    public GreenPrinter greenPrinter(){
//        return new EnglishGreenPrinter();
//    }

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }
    @Bean
    public RedPrinter redPrinter(){
        return new SpanishRedPrinter();
    }
    @Bean
    public GreenPrinter greenPrinter(){
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
