Algoritmo CalcularSueldosDificil
	Definir SueldoBase, Ventas, PrecioxVentas, Comicion, x, SueldoBaseTotal, ComicionesTotales, Total Como Real
	ComicionesTotales = 0
	SueldoBaseTotal = 0
	Hacer
		Escribir "Escriba el Sueldo Base del empleado"
		leer SueldoBase
		Escribir "Escriba cuantas Ventas hizo el empleado"
		Leer  Ventas
		Escribir "Escriba cuanto ganó por venta"
		Leer PrecioxVentas
		
		Comicion = (Ventas*
		
		PrecioxVentas)*0.10
		ComicionesTotales = Comicion + ComicionesTotales
		SueldoBaseTotal = SueldoBase + SueldoBaseTotal
		
		Escribir "Si este fue su ultimo empleado apriete [0], si no apreite [1]"
		Leer x
	Mientras Que x <> 0
	Total= ComicionesTotales+SueldoBaseTotal
	
	Escribir "El dueño debe pagar un total de [", Total, "$] del cual [", ComicionesTotales "$] son comiciones"

FinAlgoritmo
