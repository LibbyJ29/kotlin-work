# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    class Customer
    Customer: name
    Customer: address
    Customer: placeOrder()

    class Order
    Order: orderNumber
    Order: datePlaced
    Order: deliveryDate
    Order: checkStock()
    Order: takePayment()

    class OrderItem
    OrderItem: name
    OrderItem: description

    Customer --> Order: places
    Order --> OrderItem: includes
```


[mer]: https://mermaid.js.org/
