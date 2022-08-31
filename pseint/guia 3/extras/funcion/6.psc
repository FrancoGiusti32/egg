Algoritmo DigitosImpares
	Definir num Como Real
	Leer num
	Escribir Chequeo_De_Inparidad_En_Digitos(num)
FinAlgoritmo

Funcion resultado = Chequeo_De_Inparidad_En_Digitos(n)
	Definir resultado Como logico
	Definir dummy Como Real
	dummy = 0
	Repetir
		si	((n mod 10) mod 2 )= 0 
			dummy = -5
		FinSi
		n = trunc(n/10)
	Mientras Que n <> 0
	si	dummy = -5
		resultado = Falso
	SiNo
		resultado = Verdadero
	FinSi
FinFuncion
	