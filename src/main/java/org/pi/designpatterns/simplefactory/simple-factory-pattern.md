# Simple factory pattern

## Defined
* Simple factory generates an instance of an object/service for client without exposing any implementation to the client.
* In OOP, a factory is an object for creating other objects.
* Formally a factory is a function or method that returns objects of a varying prototype or class from some method call, which is assumed to be “new”

## Why, When?
* Simple factory pattern can be used when creation of an object involves some business logic beyond initialization. It helps in hiding such logic from it.

## Code explanation
* In the current package we have a factory method called `WheelFactory` which creates `CarWheel` object and returns it.
* This enables us to change the object creation logic only in one place.