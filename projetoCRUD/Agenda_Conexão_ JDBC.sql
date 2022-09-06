CREATE SCHEMA AGENDA;
USE AGENDA;
 CREATE TABLE CATEGORIA(
 
	id int not null primary key auto_increment,
    nome varchar(45) not null

);

CREATE TABLE CONTATO(

	ID INT NOT NULL primary KEY auto_increment,
    NOME VARCHAR(45) NOT NULL,
    EMAIL VARCHAR(45) NOT NULL,
    FONE VARCHAR(45) NOT NULL,
    CELULAR VARCHAR(45) NOT NULL,
    ID_CATEGORIA INT NOT NULL,
    constraint fk_id_categoria foreign key (id_categoria) references CATEGORIA(id)
    
);
DELETE FROM CATEGORIA WHERE ID=1;

SELECT *FROM CATEGORIA;
SELECT *FROM CONTATO;

INSERT INTO CATEGORIA(nome) VALUES ("AMIGOS"), ("TRABALHO"), ("FAMILIA");

INSERT INTO CONTATO (nome, email, fone, celular, id_categoria) 
   values 
          ("Mateus", "Mateus@gmail.com", "14785236", "87965412", 1 ),
          ("Lucas", "Lucas@gmail.com", "98745632", "58647129", 2 ),
          ("Silva", "Silva@gmail.com", "86473195", "98653742", 3);

