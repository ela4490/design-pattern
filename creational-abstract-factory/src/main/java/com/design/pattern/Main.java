package com.design.pattern;

import com.design.pattern.factories.AsusManufacturer;
import com.design.pattern.factories.Company;
import com.design.pattern.factories.MsiManufacturer;
import com.design.pattern.products.Product;

import java.util.List;

public class Main {
    /*
     * Video Reference: https://youtu.be/QNpwWkdFvgQ
     */
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);

    }
}