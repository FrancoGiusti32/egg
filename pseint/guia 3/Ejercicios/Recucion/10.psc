Algoritmo sumaDeNnumeros
	Definir num Como Real
	Escribir "Escriba cuantos numeros de los reales quiere que sumemos en orden"
	Leer num

  num = sumar_numeros(num)
  
  Escribir num
FinAlgoritmo

Funcion F = sumar_numeros(x)
	Definir f Como Real
	
	si x = 1
		F =1
	SiNo
		F = x + sumar_numeros(x-1)
	FinSi
	
	
FinFuncion
// *5 = 5+4+3+2+1 = 5 + 4* = n + *(n-1)
/// n + *(n-1)