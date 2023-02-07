### Avaliação final Coding Tank do Santander Coders na trilha Kotlin da Let's Code form Ada em parceria com o Banco Santander.

##Sendo os exercicios. 

#Exercicio 1:
Faça um programa que imprima os números de 1 a 100, porém com as seguintes condições:

Caso o número for divisível por 3 imprimir Fizz no lugar do número;
Caso o número for divisível por 5 imprimir Buzz no lugar do número;
Caso o número for divisível por 3 e 5 imprimir FizzBuzz no lugar do número;
Exemplo:

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
...

#Exercicio 2:

Criar um programa que pergunte para o usuário um mês e retorne a quantidade de dias que o mês possui.

O programa deve aceitar a entrada independente do case das letras, aceitando os meses com letras maiúsculas e/ou minúsculas.

Caso o usuário informe uma entrada inválida imprimir uma resposta avisando que a entrada não é válida.

Considere que não é um ano bissexto. Exemplo:

Informe o mês:
Fevereiro
Fevereiro possui 28 dias.

#Exercicio 3: 

A sequência de Fibonacci é definida da seguinte maneira:

Termo(0) = 1

Termo(1) = 1

Termo(n) = Termo(n-1) + Termo(n-2)
Ou seja, temos os dois termos iniciais que valem 1, e o restante dos termos é definido pela soma dos dois antecessores.

Note que qualquer termo da sequência equivale à soma dos dois antecessores.

Faça um programa que pergunta para o usuário até qual a quantidade de termos da sequência de Fibonacci que deseja exibir. Deverá ser exibida essa quantidade de termos da sequência de Fibonacci. Caso o usuário informe um número negativo imprima que somente é aceito números positivos.

Pode considerar somente números inteiros. Caso o usuário informe um número maior que 45 imprima que não é possível informar mais que 45 termos.

Exemplo:

Qual a quantidade de termos que deseja exibir da sequência de Fibonacci?
12
1 1 2 3 5 8 13 21 34 55 89 144

#Exercicio 4: 

A tabela SAC é uma alternativa à tabela Price. Ela também é utilizada para cálculo de prestações de empréstimos, como financiamentos imobiliários.

Ao contrário da tabela Price, ela não possui valor fixo de prestação. Ao invés disso ela possui valor fixo de amortização. Ou seja, amortiza-se o mesmo valor todo mês.

Logo no início do cálculo podemos dividir o saldo devedor pelo número total de meses para obter o valor da amortização.

Em cada mês, iremos aplicar a taxa de juros ao saldo devedor da mesma maneira que na tabela Price para descobrir quanto pagaremos de juros naquele mês. Em seguida, podemos somar taxa de juros e amortização (que é constante) para obter o valor da prestação. O novo saldo devedor é obtido subtraindo o valor amortizado, como na tabela Price.

Assim, temos que o cálculo dos valores para a tabela SAC são:

amortizacao = total_saldo_devedor / total_de_meses
juros_mensal = saldo_devedor_atual X juros_ao_mes
parcela_mensal = juros_mensal + amortizacao
saldo_devedor_atual = saldo_devedor_atual - amortizacao
Faça um programa que pergunta:

o valor de um empréstimo
a taxa de juros do empréstimo
o tempo para pagamento
Seu programa deverá mostrar o valor fixo da Amortização e mês a mês, o valor pago de juros, o valor da prestação e o saldo devedor atualizado. Ao final mostrar quanto foi o total pago nas prestações, o total amortizado e o total pago em juros. Exemplo:

Exemplo: para 30000.00 reais em 12 meses com juros de 1.5%:

Valor fixo da amortização R$ 2500,00, Saldo devedor total R$ 30000,00 com um juros de 1.5% ao mês
Parcela 1 | Juros: R$ 450,00 | Prestação: R$ 2950,00 | Saldo devedor: R$ 27500,00
Parcela 2 | Juros: R$ 412,50 | Prestação: R$ 2912,50 | Saldo devedor: R$ 25000,00
Parcela 3 | Juros: R$ 375,00 | Prestação: R$ 2875,00 | Saldo devedor: R$ 22500,00
Parcela 4 | Juros: R$ 337,50 | Prestação: R$ 2837,50 | Saldo devedor: R$ 20000,00
Parcela 5 | Juros: R$ 300,00 | Prestação: R$ 2800,00 | Saldo devedor: R$ 17500,00
Parcela 6 | Juros: R$ 262,50 | Prestação: R$ 2762,50 | Saldo devedor: R$ 15000,00
Parcela 7 | Juros: R$ 225,00 | Prestação: R$ 2725,00 | Saldo devedor: R$ 12500,00
Parcela 8 | Juros: R$ 187,50 | Prestação: R$ 2687,50 | Saldo devedor: R$ 10000,00
Parcela 9 | Juros: R$ 150,00 | Prestação: R$ 2650,00 | Saldo devedor: R$ 7500,00
Parcela 10 | Juros: R$ 112,50 | Prestação: R$ 2612,50 | Saldo devedor: R$ 5000,00
Parcela 11 | Juros: R$ 75,00 | Prestação: R$ 2575,00 | Saldo devedor: R$ 2500,00
Parcela 12 | Juros: R$ 37,50 | Prestação: R$ 2537,50 | Saldo devedor: R$ 0,00
Total: Prestação R$ 32925,00, Juros R$ 2925,00, Amortização R$ 30000,00

#Exercicio 5:

Criar um programa para fazer conversões de temperaturas, o programa deve:

pedir que o usuário digite a quantidade de temperaturas a serem transformadas.
coletar essa quantidade de valores de temperaturas do usuário.
pedir que o usuário informe a unidade de origem das temperaturas, podendo ser C para grau Celsius, K para Kelvin ou F para grau Fahrenheit. Caso a entrada não for uma das especificadas imprimir uma resposta para o usuário informando que a entrada especificada não é válida.
pedir que o usuário informe a unidade de destino das temperaturas, podendo ser C para grau Celsius, K para Kelvin ou F para grau Fahrenheit. Caso a entrada não for uma das especificadas imprimir uma resposta para o usuário informando que a entrada especificada não é válida.
Utilize as fórmulas de transformações:

C = (F - 32) * 5 / 9
F = (C * 9 / 5) + 32 
K = 273.15 + C
C = K - 273.15
Onde C é a temperatura em grau Celsius, K a temperatura em Kelvin e F a temperatura em grau Fahrenheit. Criar métodos para as conversões.

imprimir cada temperatura passada, e a unidade escolhida, e também a temperatura resultante, transformada, com sua respectiva unidade.
calcular a média das temperaturas iniciais e transformadas.
Exemplo:

Quantas temperaturas serão transformadas?
4
Informe a temperatura 1:
273.15
Informe a temperatura 2:
308.15
Informe a temperatura 3:
323.15
Informe a temperatura 4:
258.15
Qual a unidade de origem dessas temperaturas? [C, K, F]
K
Qual a unidade de destino dessas temperaturas? [C, K, F]
F
273.15 K = 32.0 F
308.15 K = 95.0 F
323.15 K = 122.0 F
258.15 K = 5.0 F
A média das temperaturas é 290.65 K = 63.5 F
