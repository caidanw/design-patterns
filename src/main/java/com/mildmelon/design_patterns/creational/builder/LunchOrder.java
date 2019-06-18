package com.mildmelon.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public class LunchOrder {

    public static class Builder {
        private String meat;
        private String bread;
        private String dressing;
        private String condiments;

        public Builder() {}

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }
    }

    private final String meat;
    private final String bread;
    private final String dressing;
    private final String condiments;

    private LunchOrder(Builder builder) {
        this.meat = builder.meat;
        this.bread = builder.bread;
        this.dressing = builder.dressing;
        this.condiments = builder.condiments;
    }

}
