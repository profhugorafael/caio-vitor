# Recursos da POO

## Static

> Static é compartilhado entre todos os possíveis objetos, isto é, é único para todos que forem utilizar.

- Quando temos um atributo ou método estatico ele nao precisa de um objeto para funcionar e existir.

```java
public class Circulo {
    public static double PI = 3.1415;

    public static double calcularArea(double raio) {
        return PI * raio * raio;
    }
}
```

```java
double valorDePI = Circulo.PI;

double resultadoArea = Circulo.calcularArea(2.0);
```

> variáveis estáticas funcionam são variáveis globais

- isso significa que se PI mudar, impacta qualquer objeto Circulo que esteja usando o valor de PI

```java
public class Conta {
    public static double selic = 1.13;
    private double saldo;
    private double nome;
}
```

## Final

Indica que a variavel esta no valor final dela, isto é, constante.

```java
public class Arqueiro {
    private final int DANO_BASE = 5;

}
```

```java
public class Circulo {
    public static final double PI = 3.1415;
}
```