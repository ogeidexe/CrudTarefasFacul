CREATE TABLE tarefa (
 id_tarefa SERIAL PRIMARY KEY NOT NULL,
 titulo varchar (50) NOT NULL,
 descricao varchar(100) NOT NULL,  
 data_inicial date,
 data_entrega date,
 status_entrega boolean,
 atraso boolean,
 prioridade character varying(10),
 prorrogada boolean,
 data_prorrogada date
);

CREATE TABLE subtarefa (
   id_subtarefa SERIAL PRIMARY KEY NOT NULL,
   nome_subtarefa varchar (50),
   descricao_subtarefa  varchar(50),
   status_entregaSub boolean

);

CREATE TABLE tarefa_subtarefa(
 id_tarefa_subtarefa SERIAL PRIMARY KEY NOT NULL,
 subtarefa_id integer,
 tarefa_id integer,
 foreign key(subtarefa_id) REFERENCES subtarefa(id_subtarefa),
 FOREIGN KEY (tarefa_id) REFERENCES tarefa (id_tarefa)
   
);