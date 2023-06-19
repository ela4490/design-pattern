package com.design.pattern.state;

import com.design.pattern.Phone;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

}
