Algoritmo SecuenciaHastaElCero
	Definir i, minimo, maximo, num, suma, divisor, promedio Como Real
	Escribir "escriba un numero "
	Leer num
	minimo = num
	suma = num
	divisor = 1
	maximo = num
	
	si num <>0 
		Hacer
			Escribir "escriba un numero "
			Leer num
			suma = suma + num
			divisor= divisor + 1
			si num > maximo
				maximo = num
			FinSi
			si (num < minimo) y (num <> 0)
				minimo = num
			FinSi
		Mientras Que num <> 0
	FinSi
	
promedio = suma/divisor
	Escribir "el minimo es [", minimo, "], el maximo es [", maximo "] y el promedioa es [", (suma/divisor) "]"
FinAlgoritmo
