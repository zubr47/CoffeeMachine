package com.example.coffeemachine

enum class Machine(val water: Int, val milk: Int, val coffeeBeans: Int, val money: Int) {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    companion object{
        var status_message = ""
         fun buy(drink: Machine) {
             when {
               drink.water > status.water ->  status_message = "Sorry, not enough water!"
               drink.milk > status.milk -> status_message = "Sorry, not enough milk!"
               drink.coffeeBeans > status.coffeeBeans -> status_message = "Sorry, not enough coffee Beans!"
               status.disposableCups < 1 ->  status_message = "Sorry, not enough disposable Cups!"

                 else -> {
                     status_message = "making you a coffee!"
                     status.water -= drink.water
                     status.milk -= drink.milk
                     status.coffeeBeans -= drink.coffeeBeans
                     status.disposableCups--
                     status.money += drink.money
                     }
                 }
             }
         }
    }
         fun take() {
     }

