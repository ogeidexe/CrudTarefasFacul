CREATE TABLE tarefa {
 id_tarefa SERIAL PRIMARY KEY NOT NULL,
 titulo varhar (50) NOT NULL,
 descricao varchar(100) NOT NULL,  
 data_inicial date,
 data_entrega date,
 status_entrega bit,
 atraso bit,
 pripridade character varying(10),
 programada bit,
 data_programada date,
 subtarefa_id integer,
 foreign key(subtarefa_id) REFERENCES subtarefa(id_subtarefa)
};

CREATE TABELE subtarefa {
  id_subtarefa SERIAL PRIMARY KEY NOT NULL,
   nome_subtarefa varchar (50),
   descricao_subtarefa  varchar(50),
   status_entregaSub bit
};