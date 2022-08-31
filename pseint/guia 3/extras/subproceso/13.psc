Algoritmo UnDiaPaAtras
	Definir dia, mes, anio Como Real
	Escribir "Escriba el dia mes y año "
	Leer dia
	Leer mes	
	Leer anio
	diaAnterior(dia,mes,anio)
	Escribir dia, "/", mes, "/", anio
FinAlgoritmo

SubProceso diaAnterior(d Por Referencia,m Por Referencia,a Por Referencia)
	
	d = d-1
	si d = 0
		d = 30
		m = m -1
		si	m = 0 
			m = 12
			a = a-1
		FinSi
	FinSi
FinSubProceso
	