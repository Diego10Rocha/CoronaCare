drop database if exists coronacare;
create database CoronaCare default character set utf8 default collate utf8_general_ci;
use CoronaCare;

drop table if exists Paciente;
create table Paciente(
id_Paciente int unsigned not null unique primary key auto_increment,
nomePaciente varchar(45) not null,
nickname varchar(45) not null unique,
emailPaciente varchar(45) not null unique,
senhaPaciente varchar(45) not null,
dataNascPaciente date not null,
telefonePaciente varchar(20) not null
);

drop table if exists Familiar;
create table Familiar(
id_Familiar int unsigned not null primary key auto_increment,
nomeFamiliar varchar(45) not null,
emailFamiliar varchar(45) not null unique,
senhaFamiliar varchar(45) not null,
dataNascFamiliar date not null,
telefoneFamiliar varchar(20) not null
);

drop table if exists Paciente_has_Familiar;
create table Paciente_has_Familiar(
id_Paciente int unsigned not null,
id_Familiar int unsigned not null,
primary key(id_Paciente, id_Familiar),
foreign key(id_Paciente) references Paciente(id_Paciente),
foreign key(id_Familiar) references Familiar(id_Familiar)
);
show tables;

describe familiar;

insert into Familiar(nomeFamiliar, emailFamiliar, senhaFamiliar, dataNascFamiliar, telefoneFamiliar)
	values("diego", "email", "123", "2001/03/20", "40028922");
    
insert into Familiar(nomeFamiliar, emailFamiliar, senhaFamiliar, dataNascFamiliar, telefoneFamiliar)
	values("torcedor", "email@bahea", "123423", "2001/03/20", "40028922");
    
select * from Familiar;
select * from Paciente;
select * from Paciente_Has_Familiar;

insert into Paciente(nomePaciente, nickname, emailPaciente, senhaPaciente, dataNascPaciente, telefonePaciente)
	values("la ele", "aaaa", "email", "123", "2001/03/20", "40028922");
    
insert into Paciente(nomePaciente, nickname, emailPaciente, senhaPaciente, dataNascPaciente, telefonePaciente)
	values("BBMP", "Bahea", "bahia@bahia", "123", "1931/01/01", "40028922");

insert into Paciente(nomePaciente, nickname, emailPaciente, senhaPaciente, dataNascPaciente, telefonePaciente)
	values("BBMP", "milgrau", "bahia@bahia1931", "12243", "1931/01/01", "40028922");
    
insert into Paciente_Has_Familiar(id_Paciente, id_Familiar)
	values (1 ,1);

insert into Paciente_Has_Familiar(id_Paciente, id_Familiar)
	values (2 ,1);
    
insert into Paciente_Has_Familiar(id_Paciente, id_Familiar)
	values (3 ,2);

drop view if exists vPacientesFamiliar;
create view vPacientesFamiliar as 
select Familiar.id_Familiar, Paciente.id_Paciente, Paciente.nomePaciente, Paciente.nickname, Paciente.emailPaciente, 
Paciente.senhaPaciente, Paciente.dataNascPaciente, Paciente.telefonePaciente
from Familiar inner join Paciente_has_Familiar on Familiar.id_Familiar = Paciente_Has_Familiar.id_Familiar
inner join Paciente on Paciente_Has_Familiar.id_Paciente = Paciente.id_Paciente;

select * from vPacientesFamiliar where id_Familiar = 1;