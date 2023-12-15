* The problem we have several condiments,
* for now we have created 2 classes which will take care of condiments
* but what if you want to change these condiments, or add new condiments
* we will have a lot of classes causing class explosion

```mermaid
---
title: Animal example
---
classDiagram
    Beverage <|-- EspressoWithSteamedMilk
    Beverage <|-- HouseBlendWithSteamedMilk
    Beverage <|-- DarkRoastWithSteamedMilkAndMocha
    Beverage <|-- EspressoWithWhipAndMocha
    Beverage <|-- DecafAndSoy
    Beverage <|-- EspressoWithWhipAndSoy
    Beverage <|-- DecafWithWhipAndSoy
    Beverage <|-- HouseBlendWithWhipAndSoy
    class Beverage {
        +getDescrition()
        +cost()
    }
    class EspressoWithSteamedMilk {
        +cost()
    }
    class HouseBlendWithSteamedMilk {
        +cost()
    }
    class DarkRoastWithSteamedMilkAndMocha {
        +cost()
    }
    class EspressoWithWhipAndMocha {
        +cost()
    }
    class DecafAndSoy {
        +cost()
    }
    class EspressoWithWhipAndSoy {
        +cost()
    }
    class DecafWithWhipAndSoy {
        +cost()
    }
    class HouseBlendWithWhipAndSoy {
        +cost()
    }
```