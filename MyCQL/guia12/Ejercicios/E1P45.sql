/* 1 */
select * 
	from empleado;
    
/*2*/
select * 
	from departamento;
    
/*3*/
select nombre_depto 
	from departamento;
    
/*4*/
select nombre , salario 
	from empleado;
    
/*5*/
select comision 
	from empleado;
    
/*6*/
select * 
	from empleado 
		where cargo='secretaria';
        
/*7*/
select * 
	from empleado 
		where cargo='vendedor'
	order by nombre;
    
/*8*/
select nombre , cargo 
	from empleado 
	order by salario asc; 
    
/*9*/
select nombre"Nombre" , cargo"Cargo"
	from empleado
	order by salario asc; 
    
/*10*/
select salario , comision  
	from empleado 
		where id_depto = 2000 
	order by comision asc;
    
/*11*/
select salario + comision + 500 "Valor total a pagar" 
	from empleado 
		where id_depto = 3000 
	order by nombre asc;
    
/*12*/
select * 
	from empleado 
		where nombre like ('j%');
        
/*13*/
select salario , comision , (salario + comision) "salario total" , nombre 
	from empleado
		where comision = 1000;
        
/*14*/
select salario , comision , (salario + comision) "salario total" , nombre 
	from empleado 
		where comision = null;
        
/*15*/
select salario , comision , (salario + comision) "salario total" , nombre 
	from empleado 
		where comision > salario;
        
/*16*/
select * , (salario * 0.3) "salario al 30" 
	from empleado 
		where comision <= (salario *0.3);
        
/*17*/
select nombre 
	from empleado 
		where nombre like ('%ma%');
        
/*18*/
select nombre_depto
	from departamento 
		where nombre_depto = "Ventas" 
			and nombre_depto !="Investigacion" 
				and nombre_depto !="Mantenimiento"; 
                
/*19*/
select nombre_depto 
	from departamento 
		where nombre_depto != "Ventas" 
			and nombre_depto !="Investigacion" 
				and nombre_depto !="Mantenimiento"; 
                
/*20*/
select max(salario) 
	from empleado;
		
/*21*/ 
select min(nombre)
	from empleado
		order by name;
        
/*22*/
select max(salario)"salario maximo", min(salario)"sañario minimo",(max(salario)-min(salario))"diferencia"
	from empleado;

/*23*/

select d.nombre_depto, round(avg(e.salario))"salario promedio"
	from empleado e , departamento d
		where e.id_depto = d.id_depto
			group by d.nombre_depto;

/*24*/
select d.nombre_depto, count(e.id_depto)"cantidad de empleados"
	from empleado e, departamento d 
		where e.id_depto = d.id_depto
			group by d.nombre_depto
				having count(e.id_depto) > 3;

/*25*/
select d.nombre_depto"nombre de jefe", count(e.cod_jefe)"cantidad de empleados"
	from empleado e, departamento d 
		where e.cod_jefe = d.codigo_director
			group by d.nombre_depto
				having count(e.cod_jefe) > 2;

/*26*/
select d.nombre_depto, count(e.id_depto)"cantidad de empleados"
	from empleado e, departamento d 
		where e.id_depto = d.id_depto
			group by d.nombre_depto
				having count(e.id_depto) < 1;

/*27*/
select nombre, salario
	from empleado
		where  salario >= (select avg(salario) from empleado)
			order by id_depto;
			
