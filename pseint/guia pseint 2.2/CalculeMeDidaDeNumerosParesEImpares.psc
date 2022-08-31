Algoritmo CalculeMeDidaDeNumerosParesEImpares
	Definir  pares, impares, num, i Como Real
	i=0
	pares=0
	impares=0
	Hacer
		Escribir "ingrese un numero"
		Leer num
		si ( num mod 2) = 0
			pares = pares + num
		SiNo
			impares = impares + num
		FinSi
		i=i+1
	Mientras Que i<10
	
	Escribir "La smedida de todos los pares es [", pares, "] y de impares [", impares "]"
FinAlgoritmo
