* We can use **State Pattern** to solve the problem
* The **State Pattern** allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
* Basically individual states will take care of how the gumball machine should behave
* and also when to transition to some other state from current state based on conditions

* with this we can easily address the requirement we got, i.e. dispensing 2 gumballs 10% of the time
* we are calling this as `WinnerState`, since the customer is getting 2 gumballs he is the winner