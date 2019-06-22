package com.mildmelon.design_patterns.structural.bridge.movie;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);

}
