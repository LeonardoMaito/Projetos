/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Interface.BasicDrink;
import Enums.AdditionalsEnum;
import Enums.DrinkSizeEnum;
import Enums.DrinkTypeEnum;

/**
 *
 * @author Leonardo Maito
 */
public class OrderBuilder {

    private double price;
    private AdditionalsEnum additional;
    private DrinkSizeEnum size;
    private BasicDrink basicDrink;

    public static class Builder {

        private double price;
        private AdditionalsEnum additional;
        private DrinkSizeEnum size;
        private double totalPrice;

        public Builder(DrinkSizeEnum size, DrinkTypeEnum drink) {
            this.size = size;
            this.price = size.getDrinkSize() * drink.getDrinkTypePrice();

        }

        public Builder getAdditionals(AdditionalsEnum additional) {
            this.additional = additional;
            this.price = this.price + additional.getAdditionalPrice();
            return this;
        }

        public OrderBuilder build() {
            return new OrderBuilder(this);
        }
    }

    private OrderBuilder(Builder builder) {
        this.price = builder.price;

    }

    public void printPrice() {
        System.out.println(this.price);
    }

    @Override
    public String toString() {
        return "OrderBuilder{" + "price=" + price + ", additional=" + additional + ", size=" + size + ", basicDrink=" + basicDrink + '}';
    }

}
