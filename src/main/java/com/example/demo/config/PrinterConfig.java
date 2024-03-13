package com.example.demo.config;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColorPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;
import com.example.demo.services.impl.ColorPrinterImpl;
import com.example.demo.services.impl.EnglishBluePrinter;
import com.example.demo.services.impl.EnglishGreenPrinter;
import com.example.demo.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//label config class with @Configuration
//so when we start the app, its going to look for the conifg files and create the beans

@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }
    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }
    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }
    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
