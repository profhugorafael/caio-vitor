# Função

> A função é um passo a passo

- finalidade
- execução
- matemática

f(x) = x + 3

f(2) = 2 + 3

- pode ter entrada (argumento / parametro)
  soma(2, 3) = 5

- pode ter retorno
  dizerOi(nome) = "oi, Pedro"

## Motivações

- reuso
- legibilidade

## Void

> void signfica vazio em inglês

é uma função que não precisa retornar ou que tem retorno vazio.

## Exemplo

```java
public class Main {

  public static int soma(int a, int b) {
    int resultado = a + b;
    return resultado;
  }

  public static void dizerOi(String nome) {
    System.out.println("oi, " + nome);
    return;
  }

  // função principal ; metodo main
  public static void main(String[] args) {
    // int, float, String, boolean, double, long

    dizerOi("Alice");
    dizerOi("Beatriz");
    dizerOi("Caio");
    dizerOi("Duda");

  }

}
```
