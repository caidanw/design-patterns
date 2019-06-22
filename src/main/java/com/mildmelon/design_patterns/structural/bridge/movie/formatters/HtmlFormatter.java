package com.mildmelon.design_patterns.structural.bridge.movie.formatters;

import com.mildmelon.design_patterns.structural.bridge.movie.Detail;
import com.mildmelon.design_patterns.structural.bridge.movie.Formatter;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("<table>");

        builder.append("<th>");
        builder.append("Classification");
        builder.append("</th>");

        builder.append("<th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail : details) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr>");
        }

        builder.append("</table>");

        return builder.toString();
    }

}
