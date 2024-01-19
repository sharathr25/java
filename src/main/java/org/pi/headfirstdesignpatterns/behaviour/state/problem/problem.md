* Initially the `GumballMachine` works well
* problem comes when there is change required
* let's take a new take new requirement
* 10% of the time, there should 2 gumballs given to the customer instead of 1
* we can do this by adding a new state called `WINNER` in the `GumballMachine`
* this will result in modification in all the methods `insertQuarter`, `ejectQuarter`, `turnCrank`, `dispense`
* which results is chaos