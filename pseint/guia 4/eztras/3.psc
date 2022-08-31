Algoritmo sin_titulo
	Definir n, v, i Como real
	Definir v1 Como Caracter
	Escribir "ingrese el tamaño de sus vector"
	Leer n
	Dimension v(n), v1(n)
	para i = 0 Hasta n-1
		Escribir "escriba el nombre de una persona"
		Leer v1(i)
		v(i) = Longitud(v1(i))
	FinPara
	para i = 0 Hasta n-1
		Escribir v1(i), " ", v(i)
	FinPara
FinAlgoritmo
