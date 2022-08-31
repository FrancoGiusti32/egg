Algoritmo queLoParioFinobachi
	Definir num Como Real
	Leer num
	
	Escribir fibonacci(num)
	
FinAlgoritmo

Funcion resultado = fibonacci(n)
	Definir  resultado, i, num1, num2, num3 Como Real
	num1 = 1
	num2 = 0
	para i= 1 hasta n
		
		num3 = num1 + num2
		num1 = num2 
		num2 = num3
	FinPara
	resultado=num2
FinFuncion
	