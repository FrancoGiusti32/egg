Algoritmo sumaDeNnumeros
	Definir num Como Real
	Escribir "Escriba cuantos numeros de los reales quiere que sumemos en orden"
	Leer num
	si (num mod 2) <> 0
		Escribir "Error"
	SiNo
		num = sumar_numeros(num)
		Escribir num
	FinSi
FinAlgoritmo

Funcion F = sumar_numeros(x)
	Definir f Como Real
	
	si x = 2
		F =2
	SiNo
		F = x + sumar_numeros(x-2)
	FinSi
	
	
FinFuncion
// *5 = 5+4+3+2+1 = 5 + 4* = n + *(n-1)
/// n + *(n-1)