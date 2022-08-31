Algoritmo DiitosDeNumeroPositivo
	Definir num, digios, num1 Como Real
	Escribir "Escriba un numero entero positivo y yo contare sus digitos"
	Leer num
	digios = 0
	num1 = num
	Mientras num <> 0
		num	= trunc(num/10)
		digios= digios +1
	FinMientras
	Escribir "[", num1, "] tiene [", digios, "] digitos"
FinAlgoritmo
