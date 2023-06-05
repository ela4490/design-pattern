package com.design.pattern.factories;

import com.design.pattern.products.Gpu;
import com.design.pattern.products.Monitor;
import com.design.pattern.products.MsiGpu;
import com.design.pattern.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}
