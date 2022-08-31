Algoritmo sin_titulo
	Definir n Como Real
	Escribir "Escriba la longitud de su vector"
	Leer n
	Dimension  vec(n)
	Definir  vec, i Como Real
	Escribir "escriba los valores del vector"
	para i = 0 Hasta  n-1 Hacer
		Leer vec(i)
	FinPara
	Escribir "El valor ams grande es: ", NumMasGrand(vec,n )
FinAlgoritmo

Funcion Resultado = NumMasGrand(x, n)
	Definir Resultado, i como real
	Resultado = x(0)
	para i = 0 hasta n-1
		si Resultado < x(i)
			Resultado=x(i)
		FinSi
	FinPara
FinFuncion
	