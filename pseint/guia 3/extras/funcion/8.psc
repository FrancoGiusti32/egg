Algoritmo Capicua
	Definir num Como Real
	Leer num
	Escribir "Es capicua ", calculo_de_capicua(num)
FinAlgoritmo

Funcion Resultado = calculo_de_capicua(n)
	Definir  Resultado Como Logico
	Definir PrimerNum, UltimoNum Como real
	PrimerNum = ( n mod 10)
	Repetir
		UltimoNum =  (n mod 10)
		n=trunc(n / 10)
	Mientras Que n <> 0
	si UltimoNum = PrimerNum
		Resultado = Verdadero
	FinSi
FinFuncion
