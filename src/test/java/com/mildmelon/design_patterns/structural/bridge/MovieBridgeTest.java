package com.mildmelon.design_patterns.structural.bridge;

import com.mildmelon.design_patterns.structural.bridge.movie.Formatter;
import com.mildmelon.design_patterns.structural.bridge.movie.Movie;
import com.mildmelon.design_patterns.structural.bridge.movie.formatters.HtmlFormatter;
import com.mildmelon.design_patterns.structural.bridge.movie.formatters.PrintFormatter;
import com.mildmelon.design_patterns.structural.bridge.movie.Printer;
import com.mildmelon.design_patterns.structural.bridge.movie.printers.MoviePrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class MovieBridgeTest {

    private Movie movie;

    @Before
    public void setup() {
        this.movie = new Movie();
        this.movie.setClassification("Action");
        this.movie.setTitle("John Wick");
        this.movie.setRuntime("2:15");
        this.movie.setYear("2014");
    }

    @Test
    public void movieBridgeTest() {
        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(this.movie);

        log.info(moviePrinter.print(printFormatter));
    }

    @Test
    public void htmlBridgeTest() {
        Formatter printFormatter = new HtmlFormatter();
        Printer moviePrinter = new MoviePrinter(this.movie);

        log.info(moviePrinter.print(printFormatter));
    }

}
