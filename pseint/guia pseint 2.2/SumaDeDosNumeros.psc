Algoritmo SumaDeDosNumeros
	Definir num1, num2, suma Como Real
	Definir respuesta Como Caracter
	Hacer
		Escribir "Escriba el numero a sumar"
		Leer  num1 
		Escribir "Escriba el segundo numero a sumar" 
		Leer num2
		suma = num1 + num2
		Escribir "Desea introducir mas numeros?"
		Leer  respuesta
	Mientras Que Minusculas(respuesta) <> (s)
	Escribir "la suma de los 2 ultimos numeros introducidos es [", suma "]"
FinAlgoritmo
