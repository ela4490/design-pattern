package com.design.pattern.factories;

import com.design.pattern.products.AsusGpu;
import com.design.pattern.products.AsusMonitor;
import com.design.pattern.products.Gpu;
import com.design.pattern.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
