CREATE TABLE ENDERECO (
    id BIGINT NOT NULL AUTO_INCREMENT,
	logradouro VARCHAR(200) NOT NULL,
	numero BIGINT NOT NULL,
	complemento VARCHAR(150) NULL,
	bairro VARCHAR(150) NULL,
    cep VARCHAR(8) NOT NULL,
    cidade VARCHAR(200) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    id_pessoa BIGINT NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO ENDERECO VALUES (1, '7 de Setembro', 15, 'apt', 'Centro', 35589400, 'Uberlândia', 'Minas Gerais',1);
INSERT INTO ENDERECO VALUES (2, 'Rua da Paz', 20, 'Casa', 'Jardim Sol', 35930265, 'Ipatinga', 'Minas Gerais',2);
INSERT INTO ENDERECO VALUES (3, 'Avenida Brasil', 50, 'Apt 305', 'Centro', 30140071, 'Belo Horizonte', 'Minas Gerais',3);
INSERT INTO ENDERECO VALUES (4, 'Rua dos Andradas', 123, 'Loja', 'Centro', 90020008, 'Porto Alegre', 'Rio Grande do Sul',4);
INSERT INTO ENDERECO VALUES (5, 'Rua Augusta', 89, 'Sala 10', 'Consolação', 01305000, 'São Paulo', 'São Paulo',5);
INSERT INTO ENDERECO VALUES (6, 'Avenida Paulista', 1578, 'Apt 1010', 'Bela Vista', 13130000, 'Campinas', 'São Paulo',6);
INSERT INTO ENDERECO VALUES (7, 'Rua Oscar Freire', 675, 'Bloco A', 'Jardins', 01426000, 'São Paulo', 'São Paulo',7);
INSERT INTO ENDERECO VALUES (8, 'Rua São Clemente', 286, 'Apt 1001', 'Botafogo', 22260000, 'Rio de Janeiro', 'Rio de Janeiro',8);
INSERT INTO ENDERECO VALUES (9, 'Largo da Carioca', 10, 'Sala 507', 'Centro', 20050020, 'Rio de Janeiro', 'Rio de Janeiro',9);
INSERT INTO ENDERECO VALUES (10, 'Rua das Laranjeiras', 450, 'Apt 302', 'Laranjeiras', 22240005, 'Rio de Janeiro', 'Rio de Janeiro',10);
INSERT INTO ENDERECO VALUES (11, 'Rua Harmonia', 305, 'Casa 2', 'Vila Madalena', 05435000, 'São Paulo', 'São Paulo',10);
INSERT INTO ENDERECO VALUES (12, 'Rua Nascimento Silva', 107, 'Apt 204', 'Ipanema', 22421020, 'Rio de Janeiro', 'Rio de Janeiro',11);
INSERT INTO ENDERECO VALUES (13, 'Avenida Atlântica', 1702, 'Apt 404', 'Copacabana', 22021000, 'Rio de Janeiro', 'Rio de Janeiro',12);
INSERT INTO ENDERECO VALUES (14, 'Rua Teixeira de Melo', 45, 'Loft', 'Ipanema', 22410030, 'Rio de Janeiro', 'Rio de Janeiro',13);
INSERT INTO ENDERECO VALUES (15, 'Rua Garcia dÁvila', 99, 'Apt 606', 'Ipanema', 22421010, 'Rio de Janeiro', 'Rio de Janeiro',14);
INSERT INTO ENDERECO VALUES (16, 'Rua Vinicius de Moraes', 39, 'Casa 1', 'Ipanema', 22411000, 'Rio de Janeiro', 'Rio de Janeiro',15);
INSERT INTO ENDERECO VALUES (17, 'Rua João Lira', 20, 'Apt 705', 'Leblon', 22430020, 'Rio de Janeiro', 'Rio de Janeiro',16);
INSERT INTO ENDERECO VALUES (18, 'Rua Rita Ludolf', 90, 'Apt 303', 'Leblon', 22450020, 'Rio de Janeiro', 'Rio de Janeiro',17);
INSERT INTO ENDERECO VALUES (19, 'Rua Dias Ferreira', 64, 'Bloco B', 'Leblon', 22431050, 'Rio de Janeiro', 'Rio de Janeiro',18);
INSERT INTO ENDERECO VALUES (20, 'Rua General Urquiza', 31, 'Casa 4', 'Leblon', 22431070, 'Rio de Janeiro', 'Rio de Janeiro',19);
INSERT INTO ENDERECO VALUES (21, 'Avenida Delfim Moreira', 50, 'Apt 601', 'Leblon', 22441000, 'Rio de Janeiro', 'Rio de Janeiro',20);
INSERT INTO ENDERECO VALUES (22, 'Rua Libero Badaró', 587, 'Sala 1301', 'Centro', 10130011, 'São Paulo', 'São Paulo',21);
INSERT INTO ENDERECO VALUES (23, 'Avenida Goiás', 2242, 'Casa 12', 'Santa Paula', 9510000, 'São Caetano do Sul', 'São Paulo',23);
INSERT INTO ENDERECO VALUES (24, 'Rodovia José Sarney', 425, 'Lote 39', 'Santa Maria', 49044000, 'Aracaju', 'Sergipe',24);
INSERT INTO ENDERECO VALUES (25, 'Rua Visconde de Inhaúma', 134, 'Sala 1711', 'Centro', 20091007, 'Rio de Janeiro', 'Rio de Janeiro',25);
INSERT INTO ENDERECO VALUES (26, 'Rua das Acácias', 742, 'Apt 501', 'Pituba', 41820020, 'Salvador', 'Bahia',26);
INSERT INTO ENDERECO VALUES (27, 'Avenida Antônio Carlos Magalhães', 846, 'Loja', 'Pituba', 41825010, 'Salvador', 'Bahia',27);
INSERT INTO ENDERECO VALUES (28, 'Rua Conselheiro Pedro Luís', 168, 'Casa', 'Rio Vermelho', 41940010, 'Salvador', 'Bahia',28);
INSERT INTO ENDERECO VALUES (29, 'Rua João Gomes', 64, 'Sala 121', 'Rio Vermelho', 41950000, 'Salvador', 'Bahia',29);
INSERT INTO ENDERECO VALUES (30, 'Praça Ana Lúcia Magalhães', 9, 'Box 19', 'Pituba', 41810450, 'Salvador', 'Bahia',30);
INSERT INTO ENDERECO VALUES (31, 'Rua das Hortênsias', 448, 'Apt 305', 'Pituba', 41820000, 'Salvador', 'Bahia',31);
INSERT INTO ENDERECO VALUES (32, 'Rua Ceará', 734, 'Prédio 9', 'Pituba', 41830210, 'Salvador', 'Bahia',32);
INSERT INTO ENDERECO VALUES (33, 'Rua Piauí', 185, 'Sala 101', 'Pituba', 41830040, 'Salvador', 'Bahia',33);
INSERT INTO ENDERECO VALUES (34, 'Rua Sergipe', 753, 'Apt 703', 'Pituba', 41830450, 'Salvador', 'Bahia',34);
INSERT INTO ENDERECO VALUES (35, 'Rua Chile', 114, 'Casa 1', 'Centro', 40020000, 'Salvador', 'Bahia',35);
INSERT INTO ENDERECO VALUES (36, 'Rua Alameda das Algarobas', 35, 'Lote 5', 'Caminho das Árvores', 41820590, 'Salvador', 'Bahia',36);
INSERT INTO ENDERECO VALUES (37, 'Rua Praia de Itamaracá', 125, 'Condomínio', 'Stiep', 41770670, 'Salvador', 'Bahia',37);
INSERT INTO ENDERECO VALUES (38, 'Rua Manoel Barreto', 175, 'Apt 1001', 'Graça', 40150230, 'Salvador', 'Bahia',38);
INSERT INTO ENDERECO VALUES (39, 'Avenida Oceânica', 814, 'Apt 1201', 'Barra', 40140060, 'Salvador', 'Bahia',39);
INSERT INTO ENDERECO VALUES (40, 'Rua Afonso Celso', 885, 'Apt 803', 'Barra', 40140120, 'Salvador', 'Bahia',40);
INSERT INTO ENDERECO VALUES (41, 'Avenida Anita Garibaldi', 1815, 'Sala 604', 'Ondina', 40170110, 'Salvador', 'Bahia',41);
INSERT INTO ENDERECO VALUES (42, 'Rua Padre Feijó', 240, 'Loja 2', 'Canela', 40110060, 'Salvador', 'Bahia',41);
INSERT INTO ENDERECO VALUES (43, 'Rua Recife', 222, 'Pavilhão', 'Pituba', 41830380, 'Salvador', 'Bahia',42);
INSERT INTO ENDERECO VALUES (44, 'Rua Rio Grande do Sul', 765, 'Sala 3', 'Pituba', 41830380, 'Salvador', 'Bahia',43);
INSERT INTO ENDERECO VALUES (45, 'Rua Pernambuco', 398, 'Loteamento', 'Pituba', 41830380, 'Salvador', 'Bahia',44);
INSERT INTO ENDERECO VALUES (46, 'Rua Paraná', 245, 'Condominio', 'Pituba', 41830380, 'Salvador', 'Bahia',45);
INSERT INTO ENDERECO VALUES (47, 'Avenida Manoel Dias da Silva', 1345, 'Subsolo', 'Pituba', 40150100, 'Salvador', 'Bahia',46);
INSERT INTO ENDERECO VALUES (48, 'Rua São Domingos', 66, 'Apt 102', 'Federação', 40210791, 'Salvador', 'Bahia',47);
INSERT INTO ENDERECO VALUES (49, 'Rua João das Botas', 90, 'Bloco B', 'Canela', 40110110, 'Salvador', 'Bahia',48);
INSERT INTO ENDERECO VALUES (50, 'Rua Fonte do Boi', 215, 'Apt 1302', 'Rio Vermelho', 41940360, 'Salvador', 'Bahia',49);
INSERT INTO ENDERECO VALUES (51, 'Rua Eduardo Santos', 130, 'Apt 402', 'Vitória', 40080001, 'Salvador', 'Bahia',50);
INSERT INTO ENDERECO VALUES (52, 'Avenida Sete de Setembro', 1537, 'Loja 08', 'Vitória', 40080001, 'Salvador', 'Bahia',51);
INSERT INTO ENDERECO VALUES (53, 'Praça da Piedade', 40, 'Edifício 2', 'Comercio', 40020001, 'Salvador', 'Bahia',52);
INSERT INTO ENDERECO VALUES (54, 'Avenida Jequitibá', 107, 'Apt 1802', 'Imbuí', 41720000, 'Salvador', 'Bahia',53);
INSERT INTO ENDERECO VALUES (55, 'Rua da Mangueira', 388, 'Apt 502', 'Paralela', 41770000, 'Salvador', 'Bahia',54);
INSERT INTO ENDERECO VALUES (56, 'Rua da Paciência', 257, 'Apt 202', 'Rio Vermelho', 41950000, 'Salvador', 'Bahia',55);
INSERT INTO ENDERECO VALUES (57, 'Rua Professor Sabino Silva', 361, 'Apt 902', 'Chame-Chame', 40157110, 'Salvador', 'Bahia',56);
INSERT INTO ENDERECO VALUES (58, 'Rua Professora Almerinda Dultra', 55, 'Casa 1', 'Rio Vermelho', 41940020, 'Salvador', 'Bahia',57);
INSERT INTO ENDERECO VALUES (59, 'Rua Eurycles de Matos', 626, 'Apt 1202', 'Ondina', 40170100, 'Salvador', 'Bahia',58);
INSERT INTO ENDERECO VALUES (60, 'Rua Visconde de Itaboraí', 939, 'Sala 3', 'Comércio', 40015070, 'Salvador', 'Bahia',45);
INSERT INTO ENDERECO VALUES (61, 'Praça Conselheiro Almeida Couto', 500, 'Bloco A', 'Nazaré', 40050000, 'Salvador', 'Bahia',60);
INSERT INTO ENDERECO VALUES (62, 'Rua Saldanha Marinho', 46, 'Loja 6', 'Barra', 40140030, 'Salvador', 'Bahia',19);
INSERT INTO ENDERECO VALUES (63, 'Rua Professor Soeiro Pereira Gomes', 108, 'Apt 501', 'Ondina', 40170901, 'Salvador', 'Bahia',46);
INSERT INTO ENDERECO VALUES (64, 'Avenida Princesa Isabel', 14, 'Apt 905', 'Barra', 40140160, 'Salvador', 'Bahia',41);
INSERT INTO ENDERECO VALUES (65, 'Avenida Presidente Vargas', 1910, 'Apt 805', 'Amaralina', 41900000, 'Salvador', 'Bahia',26);
INSERT INTO ENDERECO VALUES (66, 'Rua Miguel Burnier', 265, 'Apt 405', 'Ondina', 40130000, 'Salvador', 'Bahia',40);
INSERT INTO ENDERECO VALUES (67, 'Rua Monge Ambrósio', 289, 'Apt 302', 'Amaralina', 41905010, 'Salvador', 'Bahia',31);
INSERT INTO ENDERECO VALUES (68, 'Avenida Oceânica', 3001, 'Apt 407', 'Barra', 40170002, 'Salvador', 'Bahia',38);
INSERT INTO ENDERECO VALUES (69, 'Rua Manuelle Barbuda', 3, 'Casa 12', 'Ondina', 40170040, 'Salvador', 'Bahia',28);
INSERT INTO ENDERECO VALUES (70, 'Rua Oswaldo Cruz', 154, 'Apt 207', 'Rio Vermelho', 40140020, 'Salvador', 'Bahia',35);
INSERT INTO ENDERECO VALUES (71, 'Rua Sabino Silva', 206, 'Apt 607', 'Chame-Chame', 40157160, 'Salvador', 'Bahia',36);
INSERT INTO ENDERECO VALUES (72, 'Avenida Simon Bolivar', 455, 'Apt 107', 'Ondina', 40130000, 'Salvador', 'Bahia',23);
INSERT INTO ENDERECO VALUES (73, 'Praça Brigadeiro Faria Rocha', 100, 'Sala 908', 'Rio Vermelho', 41940200, 'Salvador', 'Bahia',22);
INSERT INTO ENDERECO VALUES (74, 'Rua Aristides Novis', 123, 'Apt 803', 'Federação', 40210901, 'Salvador', 'Bahia',11);
INSERT INTO ENDERECO VALUES (75, 'Rua Marechal Floriano', 88, 'Apt 505', 'Canela', 40110130, 'Salvador', 'Bahia',33);
