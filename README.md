<br>

## 📄Description - Exercise Statement

### Exercise 1

Create a class named "Producte" (Product) with the attributes `nom` (name) and `preu` (price), and another class named "
Venda" (Sale). This class has as its attributes a collection of products and the total price of the sale.

The "Venda" class has a method called `calcularTotal()` that throws the custom exception "VendaBuidaException" (
EmptySaleException) and displays on the screen “Per fer una venda primer has d’afegir productes” (To make a sale, you
must first add products) if the product collection is empty. If the collection has products, then it must iterate
through the collection and store the sum of all the product prices in the `preu total` (total price) attribute of the
sale.

The custom exception "VendaBuidaException" must be a child of the `Exception` class. In its constructor, we must pass
the message “Per fer una venda primer has d’afegir productes”, and when we catch the exception, we must display it on
the screen using the exception's `getMessage()` method.

Write the necessary code to generate and catch an `IndexOutOfBoundsException`.

## 💻Technologies Used

**Java**: 24 (OpenJDK)

## 📋Requirements

- Operating System: Windows/macOS/Linux.

- **Java Development Kit (JDK):** Version 24.0.1 (or higher). It is recommended to use an **OpenJDK** distribution.

- Example: JDK 21 or higher.

- Integrated Development Environment (IDE): IntelliJ IDEA.

## 🛠️Installation

- Clone the Repository:

```
git clone https://github.com/Rafadicandia/Tasca-S1.02.-Exceptions-Nivell1.git
```

- IDE Configuration:

Open the file as a Java project.

## ▶️Execution

- Execute from the IDE
    - Open the main file (the one that contains the `main` method).

    - Right-click and select "Run 'Main'".

    - To test the different code blocks, you must remove the comments "/\*\*/" inside `main`.

## 🌐Deployment

Instructions for deploying the project in a production environment or on a server.

## 🤝Contributions

### Contributions are welcome. Please report any errors by opening an issue or suggest improvements through a clear and concise Pull Request.