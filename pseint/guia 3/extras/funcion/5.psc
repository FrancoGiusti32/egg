Algoritmo calculodedigitos
	Definir num Como Real
	Leer num
	Escribir suma_de_dijitos_de_un_numero(num)
FinAlgoritmo

Funcion resultado = suma_de_dijitos_de_un_numero(n)
	Definir resultado Como Real
	resultado = 0
	Repetir
		resultado = ( resultado ) + (n mod 10)
		n = trunc(n/10)
	Mientras Que n <> 0
FinFuncion
	