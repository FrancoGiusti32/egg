Algoritmo SumaDeLosNPrimerosNumPares
	Definir Cantidad, i, num, aux Como Real
	Escribir "escriba la cantidad de numeros pares que desea"
	Leer Cantidad
	num=0
	aux=0
	i=0
	Hacer
		num = num + 2
		aux = num + aux 
		i=i+1
	Mientras Que i < Cantidad
	Escribir "La suma de los numeros es " aux
	
FinAlgoritmo
