Algoritmo sin_titulo
	Definir n, v, i , suma Como real
	Escribir "ingrese el tamaño de su vector"
	Leer n
	suma=0 
	Dimension v(n)
	Escribir "ingrese los valores al vector"
	para i = 0 Hasta  n-1
		Leer v(i)
		suma = suma + v(i)
	FinPara
	Escribir "el promedio es: ", suma / n
FinAlgoritmo
