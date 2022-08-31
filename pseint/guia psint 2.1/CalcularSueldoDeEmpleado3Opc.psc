Algoritmo CalcularSueldoDeEmpleado3Opc
	
	Definir FormaDePago, VentasTotales, Sueldo, ValorXHora, HorasDeTrabajo, Hextra Como Real
	
	Escribir "Seleccione el tipo de contrato que tiene con el empleado"
	Escribir "/ [1] Comision / [2] Salario Fijo / [3] Salario Fijo + Comision /"
	Leer FormaDePago
	
	Segun FormaDePago Hacer
		
		1:
			Escribir "Cuales han sido las ventas semanales?"
			Leer VentasTotales
			Sueldo= VentasTotales * 0.4
			Escribir "El sueldo del empleado es de: [", Sueldo, "$]"
		2:
			Escribir  "Esciba el Salario por hora del empleado"
			Leer ValorXHora
			Escribir "Cuantas Horas trabajó en la semana?"
			Leer HorasDeTrabajo
			Hextra = HorasDeTrabajo-40
			Sueldo = (ValorXHora*HorasDeTrabajo)+(Hextra*ValorXHora*0.5)
			Escribir "El sueldo del empleado es de: [", Sueldo, "$]"
		3:
			Escribir  "Esciba el Salario por hora del empleado"
			Leer ValorXHora
			Escribir "Cuantas Horas trabajó en la semana?"
			Leer HorasDeTrabajo
			Escribir "Cuales han sido las ventas semanales?"
			Leer VentasTotales
			Hextra = HorasDeTrabajo-40
			Sueldo= ((ValorXHora*(HorasDeTrabajo-Hextra))+(VentasTotales*0.25))
			Escribir "El sueldo del empleado es de: [", Sueldo, "$]"
		De Otro Modo:
			Escribir "La opcion seleccionada es incompatible"
	FinSegun
FinAlgoritmo
