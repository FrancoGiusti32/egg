Algoritmo EscaleraDeNum
	Definir num Como Entero
	Escribir "Escriba la altura de su escalera"
	Leer num
	Escalera_de_numeros(num)

FinAlgoritmo

SubProceso Escalera_de_numeros(n Por Referencia)
	Definir i Como Entero
	Definir dummy Como Caracter
	dummy = ""
	Para i= 1 Hasta  n Hacer
		dummy = Concatenar(dummy,ConvertirATexto(i))
		Escribir dummy
	FinPara
	
FinSubProceso
	