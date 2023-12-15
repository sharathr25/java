# Decorator Pattern

### Open-Closed Principle
Classes should be open for extension, but closed for modification.

To solve our problem with StarBuzz coffee shop and support changind needs of customers with new beverages, new condiments, different combinations of beverages and condiments we can use **Decorator Pattern** 

Let's assume a customer came and
* ask for dark roast coffee we create
```
DarkRoast {
    cost1
}
```
* Then customer ask for mocha we wrap our DarkRoast object with Mocha decorator
```
Mocha {
    DarkRoast {
        cost1
    }
    
    cost2
}
```
* And also the customer wants whip, we wrap again with Whip decorator
```
Whip {
Mocha {
        DarkRoast {
            cost1
        }
        
        cost2
    }
    cost3
}
```
* If that's the end of customer requirements then the total cost will be:
```Whip.cost3 + Mocha.cost2 + DarkRoast.cost1```
* And we can continue to wrap with decorators how many number of times we want and calculate the cost at the end

## Some Gotchas
* This pattern implementations are hard to understand. for example java I/O libraries
* This also adds complexity in instantiating objects(This problem can be solved using **Factory** or **Builder** pattern)