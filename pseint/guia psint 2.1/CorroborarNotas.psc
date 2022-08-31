Algoritmo CorroborarNotas
	Definir n1, n2, n3 Como Real
	Definir Correctas Como Logico
	
	Escribir "escriba las 3 notas"
	Leer n1
	Leer n2
	Leer n3
	
	Correctas=(n1<=10)y(n2<=10)y(n3<=10)y(1<=n1)y(1<=n2)y(1<=n3)
	
	si Correctas
		Escribir "las 3 notas son: Correctas"
	SiNo
		Escribir "INCORRECTO"
		
		
	FinSi
	
	
FinAlgoritmo