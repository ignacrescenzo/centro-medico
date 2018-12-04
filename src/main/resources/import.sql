insert into especialidad (id,intervalo,nombreEspecialidad) values (1,30,'Cardiología'),(2,45,'Radiología'),(3,15,'Laboratorio');
<<<<<<< HEAD
insert into medico (id,horaDesde,horaHasta,minutoDesde,minutoHasta,nombre,especialidad_id) values (1,8,16,0,30,'Juan Perez',1),(2,12,16,0,30,'Daniela Martinez',2),(3,9,12,0,0,'Ernesto Baba',3),(4,10,17,0,0,'Lucas Pratto',2);
insert into consultorio (id,numero,medico_id) values (1,100,1),(2,101,null),(3,102,3),(4,103,null),(5,104,1),(6,105,null),(7,106,2);	
insert into paciente (apellido, dni, nombre,email) values ("Messi", 111, "Lionel",'lioEl10Messi@dios.com.ar');
insert into recepcionista (nombre) values ("Jalan");
insert into diaslaborales (id,nombre) values (1,'Lunes'),(2,'Martes'),(3,'Miercoles'),(4,'Jueves'),(5,'Viernes');
insert into dias_medicos(dia_id,medico_id) values (1,1),(3,1),(5,1),(2,2),(4,2),(1,3),(2,3),(3,3),(2,4),(3,4);
insert into usuario(dni,password,medico_id,recepcionista_id,paciente_id,rol) values (111,'111',null,null,1,'paciente'),('333','333',null,1,null,'recepcionista'),('222','222',1,null,null,'medico'),('444','444',2,null,null,'medico');
insert into turno (id, derivado, estado, fecha, horario, medico_id, paciente_id) values (1,0,"En espera", "27-11-2018", "16:00", 1, 1),(2,0,"En espera", "27-11-2018", "13:00", 1, 1),(3,1,"En espera","","", 1, 1);
insert into estudio (nombre, especialidad_id) values ('Control', 1),('Ergometria', 1),('Holter', 1),('Ecocardiograma', 1),('Electrocardiograma', 1),('Tilt Text', 1),('Eco Doppler Cardiaco', 1),('Presumetria', 1),('Control', 2),('Resonancia Magnetica',2),('Tomografia',2),('Radiologia digital',2),('Radiologia panoramica',2),('Ecografia',2),('Control', 3),('Hemograma Completo',3),('Urinalizis Completo',3),('Heses por Parasitos',3),('Perfil Renal',3),('Perfil Lipidico',3),('Perfil Hepatico',3),('Perfil Triode',3),('Panel Basico Metabolico',3);
=======
insert into medico (id,horaDesde,horaHasta,minutoDesde,minutoHasta,nombre,especialidad_id) values (1,'08','16','00','30','Juan Perez',1),(2,'12','16','00','30','Daniela Martinez',2),(3,'09','12','00','00','Ernesto Baba',3),(4,'10','17','00','00','Lucas Pratto',2);
insert into consultorio (id,numero,medico_id) values (1,100,null),(2,101,null),(3,102,3),(4,103,null),(5,104,null),(6,105,null),(7,106,null);	
insert into paciente (apellido, dni, nombre,email) values ("Messi", 111, "Lionel",'lioEl10Messi@dios.com.ar');
insert into recepcionista (nombre) values ("Jalan");
insert into diaslaborales (id,nombre) values (1,'Lunes'),(2,'Martes'),(3,'Miercoles'),(4,'Jueves'),(5,'Viernes');
insert into dias_medicos(dia_id,medico_id) values (1,1),(3,1),(5,1),(2,2),(4,2),(1,3),(2,3),(3,3),(2,4),(3,4);
insert into usuario(dni,password,medico_id,recepcionista_id,paciente_id,rol) values (111,'111',null,null,1,'paciente'),('333','333',null,1,null,'recepcionista'),('222','222',1,null,null,'medico'),('444','444',2,null,null,'medico');
insert into estudio (nombre, especialidad_id) values ('Control', 1),('Ergometria', 1),('Holter', 1),('Ecocardiograma', 1),('Electrocardiograma', 1),('Tilt Text', 1),('Eco Doppler Cardiaco', 1),('Presumetria', 1),('Control', 2),('Resonancia Magnetica',2),('Tomografia',2),('Radiologia digital',2),('Radiologia panoramica',2),('Ecografia',2),('Control', 3),('Hemograma Completo',3),('Urinalizis Completo',3),('Heses por Parasitos',3),('Perfil Renal',3),('Perfil Lipidico',3),('Perfil Hepatico',3),('Perfil Triode',3),('Panel Basico Metabolico',3);
insert into turno (id, derivado, estado, fecha, horario, medico_id, paciente_id,estudio_id) values (1,0,"Atendido", "30-11-2018", "16:00", 1, 1,1),(2,0,"Abonado", "30-11-2018", "13:00", 1, 1,null),(3,1,"En espera",null,null, 1, 1,null);
insert into atencion (descripcion,fecha,medico_id,paciente_id,turno_id) values ("Descripcion 1","27-11-2018",1,1,1),("Descripcion 2","29-11-2018",1,1,2),("Descripcion 3","27-11-2018",1,1,null);
>>>>>>> branch 'master' of https://github.com/ignacrescenzo/centro-medico.git
