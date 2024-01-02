* If you see in `RemoteControl` number of slots available is 7
* We have connected light, tv etc in 4 of the slots
* The thing is light can turn on/off, tv can turn on, off, change volume, change channel
* So to control each slot we are using `switch` statement which is not scalable at all
* Whenever we need to change a slot or add something new in a new slot we have to modify `RemoteControl` class
* This violates **Open-Closed** principle