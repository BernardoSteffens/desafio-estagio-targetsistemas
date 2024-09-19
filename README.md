# Desafio de Programação - Target Sistemas

## Questão 1
Dado a sequência de Fibonacci, que se inicia por  e 1, onde o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: , 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem de sua escolha que, ao ser informado um número, calcule a sequência de Fibonacci e retorne uma mensagem indicando se o número informado pertence ou não à sequência.

**[Solução](https://github.com/BernardoSteffens/desafio-estagio-targetsistemas/blob/master/src/Fibonacci.java)**

---

## Questão 2
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja ela maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

**[Solução](https://github.com/BernardoSteffens/desafio-estagio-targetsistemas/blob/master/src/VerifiqueA.java)**

---

## Questão 3
Observe o trecho de código abaixo:

```java
int INDICE = 12, SOMA = , K = 1; 
enquanto K < INDICE faça {
    K = K + 1; 
    SOMA = SOMA + K; 
} 
imprimir(SOMA);
```

Ao final do processamento, qual será o valor da variável SOMA?

**Resposta:** 77

**[Código](https://github.com/BernardoSteffens/desafio-estagio-targetsistemas/blob/master/src/TesteCodigo.java)**

---

## Questão 4
Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___  
**Resposta:** 9  

b) 2, 4, 8, 16, 32, 64, ____  
**Resposta:** 128  

c) , 1, 4, 9, 16, 25, 36, ____  
**Resposta:** 49  

d) 4, 16, 36, 64, ____  
**Resposta:** 100  

e) 1, 1, 2, 3, 5, 8, ____  
**Resposta:** 13  

f) 2, 10, 12, 16, 17, 18, 19, ____  
**Resposta:** 20  

---

## Questão 5
Basta ligar o primeiro interruptor, deixar por um tempo, após isso desliga o primeiro e liga o segundo, nesse momento você vai a primeira sala, se a luz estiver acessa, essa é a lampada do segundo interruptor que está ligado, se não estiver acessa, mas estiver quente, é do primeiro, caso a lampada esteja apagada e fria é do terceiro interruptor que não foi ligado, descoberta a primeira, apenas ir para a proxima sala e ver em qual se encaixa, tendo descoberto duas, vai restar apenas um interruptor, que é o da sala em que você estava.
