Algoritmo sin_titulo
	Definir N Como Real
	Escribir "Cuantos numeros desea ingresar?"
	Leer n
	Dimension num(N)
	Definir num, i, x Como Real
	Definir Encontrado Como Logico
	
	Escribir "Escriba los numeros a ingresar"
	para i = 0 Hasta n-1
		Leer num(i)
	FinPara
	
	Escribir "escriba el numero que quiere buscar"
	Leer x
	Encontrado = Falso
	para i = 0  Hasta n-1
		si num(i)=x
			Escribir "El numero se encontró en la pocision ", i
			Encontrado = Verdadero
		FinSi
	FinPara
	
	si Encontrado = Falso
		Escribir "No se encontró el numero dentro del vector"
	FinSi
FinAlgoritmo
