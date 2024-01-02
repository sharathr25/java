* We have **Command Pattern** to solve our problem
* The **Command Pattern** encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
* For demonstration, we only implemented 2 command light on and light off for the light
* But we can extend the same `Command` interface to create other commands to control other slots, For ex: `TvOnCommand`, `TvOffCommand`, `StereoOnCommand` etc
* We have also implemented `undo` mechanism i.e restoring previous state by adding one more method in `Command` interface and implementing it in all commands
* We have also implemented `MacroCommand` to execute multiple commands together in turn controlling multiple appliances

```
.---------------------------.
|                           |
|       .----------.        |
|       |          |        |
|       | action() |        |
|       |          |        |
|       '----------'        |
|         Receiver          |
|                           |
| execute() {               |
|     reveiver.action();    |
| }                         |
|                           |
'---------------------------'
          Command
```