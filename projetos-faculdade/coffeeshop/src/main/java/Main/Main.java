/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Builder.OrderBuilder;
import static Enums.DrinkSizeEnum.*;
import static Enums.DrinkTypeEnum.*;
import static Enums.AdditionalsEnum.*;

/**
 *
 * @author Leonardo Maito
 */
public class Main {

    public static void main(String[] args) {

        OrderBuilder order = new OrderBuilder.Builder(Small, CoffeeMilk)
                                             .getAdditionals(MilkPowder)
                                             .getAdditionals(IceCreamMilk)
                                             .getAdditionals(CondensedMilk)
                                             .build();

        order.printPrice();

    }
}
