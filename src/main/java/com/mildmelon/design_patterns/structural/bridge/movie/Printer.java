package com.mildmelon.design_patterns.structural.bridge.movie;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(this.getHeader(), this.getDetails());
    }

    abstract protected String getHeader();

    abstract protected List<Detail> getDetails();

}
