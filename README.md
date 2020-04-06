**Design Patterns**
##
**Creational**
These design patterns are all about class instantiation or object creation. These patterns can be further categorized into Class-creational patterns and object-creational patterns. While class-creation patterns use inheritance effectively in the instantiation process, object-creation patterns use delegation effectively to get the job done.

**Abstract Factory** Creates an instance of several families of classes<br>
`Farmeworks`<br>
**Builder** Separates object construction from its representation<br>
`String Builder`<br>
**Factory Method** Creates an instance of several derived classes<br>
`Calendar - NumberFormat - ResourceBundle`<br>
**Prototype** A fully initialized instance to be copied or cloned<br>
`java.lang.Object#clone()`<br>
**Singleton** A class of which only a single instance can exist<br>
`Runtime - Logger - Spring Beans`<br>
##
**Structural** These design patterns are about organizing different classes and objects to form larger structures and provide new 
functionality.

**Adapter** Match interfaces of different classes<br>
`Arrays.asList()`<br>
**Bridge** Separates an object’s interface from its implementation<br>
`Drivers - JDBC`<br> 
**Composite** A tree structure of simple and composite objects<br>
`java.awt.Component - JSF widget`<br>
**Decorator** Add responsibilities to objects dynamically<br>
`java.io.InputStream - java.util.Collections.checkedList - UI Components`<br>
**Facade** A single class that represents an entire subsystem<br>
`java.net.URL - java.faces.context.FacesContext`<br>
**Flyweight** A fine-grained instance used for efficient sharing<br>
`java.lang.String - java.lang.Integer#valueOf(int) - Boolean, Byte, Character, Short, Long`<br>
**Proxy** An object representing another object<br>
`java.lang.reflect.proxy - java.rmi.*`
##
**Behavioral**
Behavioral patterns are about identifying common communication patterns between objects and realize these patterns.

**Chain of responsibility** A way of passing a request between a chain of objects<br>
`java.util.logging.Logger#log() - javax.servlet.Filter.doFilter() - Spring Security Filter Chain`<br>
**Command** Encapsulate a command request as an object<br>
`Object Oriented Callback - java.lang.Runnable - javax.swing.Action`<br>
**Interpreter** A way to include language elements in a program<br>
`java.util.pattern - java.text.Format`<br>
**Iterator** Sequentially access the elements of a collection<br>
`java.util.Iterator - java.util.Enumeration`<br>
**Mediator** Defines simplified communication between classes<br>
`java.util.Timer`<br>
**Memento** Capture and restore an object's internal state<br>
`java.util.Date - java.io.Serializable`<br>
**Observer** A way of notifying change to a number of classes<br>
`java.util.Observer - java.util.EventListener - javax.jms.Topic`<br>
**State** Alter an object's behavior when its state changes<br>
`Iterator - JSF`<br>
**Strategy** Encapsulates an algorithm inside a class<br>
`java.util.Comparator`<br>
**Template method** Defer the exact steps of an algorithm to a subclass<br>
`java.util.Collections#sort`<br>
**Visitor** Defines a new operation to a class without change<br>
`javax.lang.model.element.Element - javax.lang.model.element.ElementVisitor`<br>
