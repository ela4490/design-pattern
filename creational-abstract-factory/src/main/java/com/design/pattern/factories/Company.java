package com.design.pattern.factories;

import com.design.pattern.products.Gpu;
import com.design.pattern.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
