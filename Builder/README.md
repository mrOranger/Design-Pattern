# BUILDER DESIGN PATTERN
The Builder Pattern is a Creational Design Pattern based on we can abstract the building of a complex objec from its representation.
The Pattern is composed by the following element: 
__Builder__ defines the interface through with can build the different parts of the object.
__ConcreteBuilder__ defines the concrete class through with we create the specific product.
__Engineer__ is the interface through with we can build a specific product using the ConcreteBuilder.
__Client__ represents the Client that asks to the Engineer the specific product to build.
This pattern has been implemented using the Abstract Factory Design Pattern, used to indicate the specific product to build.