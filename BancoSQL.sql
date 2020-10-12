
CREATE TABLE public.tarefa (
 id_tarefa SERIAL PRIMARY KEY NOT NULL,
 data_inicial date,
 data_entrega date,
 titulo character varying(60) NOT NULL,
 descricao character varying(100) NOT NULL,
 status_entrega bit,
 atraso bit,
 pripridade character varying(10),
 programada bit,
 data_programada date
 
);

CREATE TABLE public.subtarefa
(
   id_subtarefa SERIAL PRIMARY KEY NOT NULL,
   nome_subtarefa character varying(50),
   descricao_subtarefa character varying(50),
   status_entregaSub bit,
   fk_id_Tarefa integer,
   FOREIGN KEY (fk_id_Tarefa) REFERENCES tarefa (id_tarefa)
);