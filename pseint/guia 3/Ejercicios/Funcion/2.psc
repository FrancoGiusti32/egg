Algoritmo ParOImpar
	Definir num como real
	Leer  num
	Escribir "el num ", num "es par?"
	Escribir Calculo_de_paridad(num)
FinAlgoritmo

Funcion ParOno <- Calculo_de_paridad (n)
	Definir ParOno Como Logico
	
	ParOno = n mod 2 = 0
Fin Funcion
