Algoritmo producto_de_vector
	Definir v, i, n, resultado  Como Entero
	Escribir "escriba el tamaño del vector"
	Leer  n
	Dimension v(n)
	para i = 0 hasta n-1
		Leer v(i)
	FinPara
	resultado = 1
	para i = 0 hasta n-1
		resultado = resultado * v(i)
	FinPara
	Escribir resultado
FinAlgoritmo
