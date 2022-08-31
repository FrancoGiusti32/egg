Algoritmo Primo
	Definir num como real
	Leer  num
	Escribir "El numero es primo"
	Escribir Calculo_de_primidad(num)
	
FinAlgoritmo

Funcion PrimoOno <- Calculo_de_primidad (n)
	Definir PrimoOno Como Logico
	Definir i, reaccion Como Entero
	reaccion = 0
	Para i = 1 hasta n	
		si n mod i = 0
			reaccion = reaccion +1
		FinSi
	FinPara
	si reaccion = 2 
		PrimoOno = Verdadero
	SiNo
		PrimoOno = Falso
	FinSi
Fin Funcion
