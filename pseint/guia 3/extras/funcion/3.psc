Algoritmo Logueo
	Definir Usuario, contrasena Como Caracter
	Escribir "Escriba su usuario"
	Leer Usuario
	Escribir "Escriba su contraseña"
	Leer contrasena
	Si Loguin(Usuario,contrasena) = Verdadero
		Escribir "Bienvenido"
	SiNo
		Escribir "####Demaciados intentos####"
	FinSi
	
FinAlgoritmo

Funcion Verificado = Loguin(U,C)
	Definir Verificado Como Logico
	Definir i Como Real
	si (U="usuario1") y (C="asdasd")
		Verificado = Verdadero	
	sino
		i=1
		hacer
			Escribir "Contraseña o usuario erroneos, escriba un usuario y contraseña valido porfavor: "
			Escribir "Escriba su usuario "
			Leer U
			Escribir "Escriba su contraseña"
			Leer C
			i = i+1
		Mientras Que (i <= 2) y ((U<>"usuario1") y (C<>"asdasd"))
		si (U="usuario1") y (C="asdasd")
			Verificado = Verdadero
		FinSi
	FinSi
FinFuncion
	