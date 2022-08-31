Algoritmo diasHMS
	Definir dias, horas, minutos, seg Como Entero
	
	Escribir "escriba la cantidad de dias a transformar a horas, minutos y seugundos"
	
	Leer dias
	
	horas = dias*24
	minutos = dias*24*60
	seg = dias*24*60*60
	
	Escribir dias," dia/s son:" 
	Escribir "[", horas, "] Horas, [", minutos, "] minutos y [", seg, "] segundos"
FinAlgoritmo
