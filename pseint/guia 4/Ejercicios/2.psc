Algoritmo sin_titulo
	Dimension  num(10)
	Definir  num, i, suma, resta, multiplicacion Como Real
	Escribir "escriba 5 valores para mostrard e forma invertida"
	para i = 0 Hasta 9
		Leer num(i)
	FinPara
	
	sumando(suma, num)
	restando(resta,num)
	multiplicando(multiplicacion, num)
	
	Escribir suma, " ", resta, " " multiplicacion

FinAlgoritmo


SubAlgoritmo sumando( suma por referencia, num)
	Definir i  Como Real
	suma = 0
	para i = 0 hasta 9
		suma=suma+num(i)
	FinPara
FinSubAlgoritmo
SubAlgoritmo restando( resta por referencia, num)
	Definir i  Como Real
	resta = num(0)
	para i = 1 hasta 9
		resta=-resta-num(i)
	FinPara
FinSubAlgoritmo
SubAlgoritmo multiplicando ( multiplicacion por referencia, num)
	Definir i  Como Real
	multiplicacion = num(0)
	para i = 1 hasta 9
		multiplicacion=multiplicacion*num(i)
	FinPara
FinSubAlgoritmo