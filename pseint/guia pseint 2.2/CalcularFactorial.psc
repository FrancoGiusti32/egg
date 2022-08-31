Algoritmo CalcularFactorial
	Definir i, num, j Como Real
	num=1
	Para i = 1 Hasta 5  
		Para j = 1 hasta i
			num = j * num
			Escribir Sin Saltar j
			si j <> i
				Escribir Sin Saltar " * "
			FinSi
		FinPara
		Escribir " = ", num
		num = 1
		j = 1
	FinPara
FinAlgoritmo
