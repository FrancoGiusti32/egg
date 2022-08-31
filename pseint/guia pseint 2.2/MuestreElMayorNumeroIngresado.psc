Algoritmo MuestreElMayorNumeroIngresado
	Definir i, Num, Cantidad, j Como Real
	Escribir "Cuantos Numeros desea ingresar?"
	Leer Cantidad
	j = 0
	Para i = 1 Hasta Cantidad Hacer
		Escribir "escriba un numero"
		Leer num
		si num > j
			j = num
		FinSi
	FinPara
	Escribir "el numero ams grande fue: [", j "]"
FinAlgoritmo
