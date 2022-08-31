Algoritmo sin_titulo
	Definir v, deficientes, regulares , buenos ,exelentes, i Como Entero
	Dimension v(100)
	para i = 0 hasta 99
		v(i)= Aleatorio(0 ,20)
	FinPara
	deficientes = 0
	regulares = 0
	buenos = 0
	exelentes = 0
	para i = 0 hasta 99
		si v(i)<=5
			deficientes = deficientes +1
		SiNo
			si v(i) <= 10 y v(i) > 5
				regulares = regulares +1
			SiNo
				si v(i) <= 15 y v(i) > 10
					buenos = buenos +1
				SiNo
					exelentes = exelentes + 1
				FinSi
			FinSi
		FinSi
		
	FinPara
	Escribir "deficientes ", deficientes
	Escribir "regulares ", regulares
	Escribir "buenos ", buenos
	Escribir "exelentes ", exelentes
FinAlgoritmo
////Deficientes 0-5
////b) Regulares 6-10
////c) Buenos 11-15
////d) Excelentes 16-20