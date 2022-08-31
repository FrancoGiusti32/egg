Algoritmo sin_titulo
	Definir n, v, i Como Real
	Leer n
	Dimension v(n)
	para i = 0 hasta n-1
		Leer v(i)
	FinPara
	Escribir  diferencia(v,n)
FinAlgoritmo

Funcion resultado=diferencia(v,n)
	Definir  resultado , mayor ,  menor, i Como real
	mayor = 0
	menor = v(0)
	para i = 0 Hasta  n-1
		si v(i) > mayor
			mayor = v(i)
		FinSi
		si v(i) < menor
			menor = v(i)
		FinSi
	FinPara
	resultado = mayor - menor
FinFuncion
	