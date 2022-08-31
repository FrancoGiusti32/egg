Algoritmo CalculoCombinatorio
	Definir Num1, num2 Como Real
	Repetir
	Escribir "Escriba los m elementos tomados de n y n misma (n debe ser mayor a 0 y menor que m) "
	Leer Num1 ///m
	Leer num2 ///n
	Mientras Que num2 <= 0 o num2 > num1 
	Escribir calculo_de_combinatoria(Num1,num2) 
	
FinAlgoritmo

Funcion respuesta = calculo_de_combinatoria(m,n) 
	Definir Respuesta Como Real
	Respuesta = (Factorial(m))/(Factorial(n)*(Factorial(m-n)))
FinFuncion

Funcion Respuesta = Factorial(n)
	Definir Respuesta, i Como Real
	Respuesta = 1
	Para i = 1 Hasta  n
		Respuesta = Respuesta * i
	FinPara
FinFuncion
	