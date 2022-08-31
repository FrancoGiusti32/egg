Algoritmo CadenaAnum
	Definir Num, prueba Como Caracter
	prueba = "test"
	hacer
	Escribir "escriba su numero de hasta 3 digitos"
	Leer num
	Escribir Concatenar(prueba,num)
Mientras Que transformacion_de_caracter_a_numero(num) > 999
Escribir "Ahora ", transformacion_de_caracter_a_numero(num) " es un numero"

FinAlgoritmo

Funcion resultado = transformacion_de_caracter_a_numero(x)
	Definir  resultado Como entero
	resultado = ConvertirANumero(x)
FinFuncion
	