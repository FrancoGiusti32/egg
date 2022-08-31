Algoritmo sin_titulo
	Dimension X(5,5)
	Definir x, num, j , i  Como entero
	Definir encontrado Como Logico
	Escribir "Que nuemro desea buscar?"
	Leer num
	encontrado = Falso
	Para i = 0 hasta 4
		para j = 0 hasta 4
			x(i,j)=Aleatorio(0,50)
		FinPara
	FinPara
	Para i = 0 hasta 4
		para j = 0 hasta 4
			si x(i,j)=num
				Escribir "Sen encontró el valor en: " i, "/", j
				encontrado = Verdadero
			FinSi
		FinPara
	FinPara
	si encontrado = Falso
		escribir "No se encontró el numero"
	FinSi
FinAlgoritmo
