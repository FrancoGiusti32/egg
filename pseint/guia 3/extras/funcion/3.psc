Algoritmo Logueo
	Definir Usuario, contrasena Como Caracter
	Escribir "Escriba su usuario"
	Leer Usuario
	Escribir "Escriba su contrase�a"
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
			Escribir "Contrase�a o usuario erroneos, escriba un usuario y contrase�a valido porfavor: "
			Escribir "Escriba su usuario "
			Leer U
			Escribir "Escriba su contrase�a"
			Leer C
			i = i+1
		Mientras Que (i <= 2) y ((U<>"usuario1") y (C<>"asdasd"))
		si (U="usuario1") y (C="asdasd")
			Verificado = Verdadero
		FinSi
	FinSi
FinFuncion
	