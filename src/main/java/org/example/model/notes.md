CascadeType.ALL:

Ensures all operations on Customer (e.g., save, delete) are cascaded to Order.
orphanRemoval = true:

Automatically deletes orders if they are removed from the Customer's orders list.
mappedBy:

Specifies that the orders field in Customer is mapped by the customer field in Order.