Algoritmo SumaDlosDivisoresDeN
	Definir Num Como Real
	Escribir "Ingrese el numero"
	Leer  num
	Escribir "La suma de de todos los divisores de ", num " exepto el mismo es " suma_de_todos_los_div(num)
FinAlgoritmo

Funcion Suma = suma_de_todos_los_div(n)
	Definir suma, i Como Real
	suma = 0
	Para i=1 Hasta n-1
		si	n mod i = 0
			suma = suma + i 
		FinSi
	FinPara
FinFuncion
	