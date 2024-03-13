package com.example.demo.services.impl;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColorPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;
    //Spring will check for which dependencies are needed and inject them
    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
