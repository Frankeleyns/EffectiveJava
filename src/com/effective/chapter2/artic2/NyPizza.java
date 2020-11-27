package com.effective.chapter2.artic2;

import java.util.Objects;

//纽约披萨
public class NyPizza extends Pizza{
    //中，大，超大
    public enum Size{ SMALL,  MEDIUM, LARGE, }
    private Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
