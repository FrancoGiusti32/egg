Algoritmo SecuenciaHastaElMenosUno
	Definir num, divisor, Promedio, num1, suma Como Real
	Escribir "esciba una secuencia de numero que finalice con un -1"
	Leer num1
	divisor = 1
	
	Mientras num1 <> -1 
		Escribir "Ingrese el proximo numero"
		Leer num
		suma = num1 + num
		num1 = num
		divisor= divisor + 1
	FinMientras
	Promedio = suma/divisor
Escribir "el promedio es:", divisor
FinAlgoritmo
