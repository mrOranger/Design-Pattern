# SINGLETON DESIGN PATTERN
The Singletion design pattern is a **Creational Design Pattern** described by the __Gang Of Four__ which scope is tu guarantee that a class must be instantiated only one time and to provied an unique point of access to this instance. 
The class is defined by an unique private constructor and a private attribute representing the instance to return using a public method. 
The Design Pattern is usefull in all the case in which we need to use only an instance of the class, avoiding the use of different objects, for example to manage the connection to a Database.