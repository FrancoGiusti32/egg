Algoritmo calculoDeJornal
	Definir Nombre, Dia, respuesta, respuesta_dos Como caracter
	Definir Horas Como Real
	Definir  festivo, TipoDeJornada como logico
	
	Escribir "Escriba el nombre del Trabajador"
	Leer Nombre
	Escribir "Que dia de la semana trabajó?"
	Leer Dia
	Escribir "Cuantas horas trabajó?"
	Leer Horas
	Escribir "El dia ", dia " era día festivo?"
	Leer respuesta
	si Minusculas(respuesta) = "si" o Minusculas(respuesta) = "s"
		festivo = Verdadero
	SiNo
		festivo = falso
	FinSi
	Escribir "Era jornada [diurna] o [nocturna]?"
	Leer respuesta
	si Minusculas(respuesta) = "diurna" o Minusculas(respuesta) = "d"
		TipoDeJornada = Verdadero
	SiNo
		TipoDeJornada = falso
	FinSi
	
	Escribir "A ", Nombre " se le debe pagar ", Calculo_De_Jornada(horas, festivo, TipoDeJornada)
FinAlgoritmo

Funcion Paga = Calculo_De_Jornada(h,f,j)
	Definir Paga Como Real
	si j = Verdadero
		si	f = Verdadero
			Paga = h * 90 * 1.1
		SiNo
			Paga = h * 90
		FinSi
	SiNo
		si	f = Verdadero
			Paga = h * 125 * 1.15
		SiNo
			Paga = h * 125
		FinSi
	FinSi
FinFuncion
	