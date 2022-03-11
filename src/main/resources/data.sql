 insert into asignatura (id, nombre, descripcion, curso)
	select 1, 'Lengua', 'Asignatura de lengua', 2 from dual where not exists (select 1 from asignatura where id = 1);
	
 insert into asignatura (id, nombre, descripcion, curso)
	select 2, 'Matematicas', 'Asignatura de Matematicas', 2 from dual where not exists (select 1 from asignatura where id = 2);