Algoritmo NuemerosDecimalesYmayoresAlPrimero
	Definir primero, num Como Real
	Hacer
		Escribir "Escriba un numero decimal"
		Leer primero
	Mientras Que primero = (trunc(primero))
	
	Hacer
		Escribir "El programa seguirá corriendo simpre que incerte un numero mayor a [", primero, "]"
		Leer num
	Mientras Que num>primero
	Escribir "insertó un numero menor"
	
FinAlgoritmo