package com.mildmelon.design_patterns.structural.bridge.movie.formatters;

import com.mildmelon.design_patterns.structural.bridge.movie.Detail;
import com.mildmelon.design_patterns.structural.bridge.movie.Formatter;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("\n");
        builder.append(header);
        builder.append("\n");

        for (Detail detail : details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }

}
