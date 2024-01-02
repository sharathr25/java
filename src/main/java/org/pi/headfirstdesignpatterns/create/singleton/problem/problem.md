* Even though we have created singleton class, there might be issues when different threads gets instances.
* The threads might get new objects
* If you run the program you will get ambiguous outputs like below
2 threads getting there new objects, instead of 2nd thread getting the same object
```shell
Filled
Boiled
Drained
Filled
Boiled
Drained
```
OR
Correct o/p, threads getting same objects and once 1st thread object finishes execution, the same is true for other threads. hence no output for other threads 
```shell
Filled
Boiled
Drained
```