package com.example.demo.services.impl;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColorPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(){
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
