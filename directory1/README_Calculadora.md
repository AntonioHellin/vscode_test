# Calculadora.java

Esta clase implementa una calculadora básica con operaciones aritméticas simples sobre números de tipo double.

## Métodos

- **sumar(double a, double b): double**
  - Devuelve la suma de `a` y `b`.

- **restar(double a, double b): double**
  - Devuelve la resta de `a` menos `b`.

- **multiplicar(double a, double b): double**
  - Devuelve el producto de `a` y `b`.

- **dividir(double a, double b): double**
  - Devuelve el cociente de `a` entre `b`.
  - Lanza una excepción `ArithmeticException` si `b` es cero.

## Ejemplo de uso

```java
Calculadora calc = new Calculadora();
double suma = calc.sumar(2, 3); // 5.0
double resta = calc.restar(5, 2); // 3.0
double producto = calc.multiplicar(4, 2); // 8.0
double division = calc.dividir(10, 2); // 5.0
```

## Notas
- El método `dividir` no permite la división por cero y lanzará una excepción si se intenta.
- Todos los métodos trabajan con números de tipo `double`.
