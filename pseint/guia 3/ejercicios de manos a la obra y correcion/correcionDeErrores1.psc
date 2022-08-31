Algoritmo sin_titulo
	Definir x Como Real
	Escribir "escriba un num"
	Leer  x
	Escribir "El numero ", x " es par"
	Escribir Paridad(x)
FinAlgoritmo

Funcion retorno <- Paridad ( num )
	Definir retorno Como Logico
	retorno = num MOD 2 == 0
Fin Funcion