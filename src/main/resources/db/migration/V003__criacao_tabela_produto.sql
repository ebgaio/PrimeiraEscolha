CREATE TABLE PRODUTO (
    id BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	descricao VARCHAR(200) NOT NULL,
    quantidade BIGINT NOT NULL,
    preco BIGINT NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO PRODUTO VALUES (1,'Banana','Banana Prata', 30, 20.00);
INSERT INTO PRODUTO VALUES (2,'Acerola','Acerola ripe', 25, 15.00);
INSERT INTO PRODUTO VALUES (3,'Açai','Frozen açai', 60, 100.00);
INSERT INTO PRODUTO VALUES (4,'Papaya','Papaya Solo', 50, 45.00);
INSERT INTO PRODUTO VALUES (5,'Cashew','Cashew nut', 10, 300.00);
INSERT INTO PRODUTO VALUES (6,'Mango','Yellow mango', 35, 55.00);
INSERT INTO PRODUTO VALUES (7,'Pineapple','Sweet pineapple', 20, 30.00);
INSERT INTO PRODUTO VALUES (8,'Guava','Red guava', 40, 40.00);
INSERT INTO PRODUTO VALUES (9,'Passion Fruit','Passion fruit 1kg', 15, 70.00);
INSERT INTO PRODUTO VALUES (10,'Cassava','Cassava root', 30, 20.00);
INSERT INTO PRODUTO VALUES (11,'Okra','Fresh okra 1kg', 10, 15.00);
INSERT INTO PRODUTO VALUES (12,'Chayote','Chayote fruit', 20, 25.00);
INSERT INTO PRODUTO VALUES (13,'Yam','Yam root', 30, 35.00);
INSERT INTO PRODUTO VALUES (14,'Coconut','Green coconut', 40, 55.00);
INSERT INTO PRODUTO VALUES (15,'Tangerine','Tangerine Ponkan', 30, 20.00);
INSERT INTO PRODUTO VALUES (16,'Lychee','Lychee fruit', 50, 60.00);
INSERT INTO PRODUTO VALUES (17,'Watermelon','Watermelon fruit', 30, 25.00);
INSERT INTO PRODUTO VALUES (18,'Cantaloupe','Cantaloupe Melon', 20, 30.00);
INSERT INTO PRODUTO VALUES (19,'Avocado','Avocado fruit', 60, 20.00);
INSERT INTO PRODUTO VALUES (20,'Pitaya','Dragon fruit', 40, 80.00);
INSERT INTO PRODUTO VALUES (21,'Guaraná','Guaraná fruit', 35, 75.00);
INSERT INTO PRODUTO VALUES (22,'Feijoa','Pineapple guava', 50, 65.00);
INSERT INTO PRODUTO VALUES (23,'Blackberry','Blackberries', 45, 70.00);
INSERT INTO PRODUTO VALUES (24,'Jackfruit','Jackfruit', 20, 55.00);
INSERT INTO PRODUTO VALUES (25,'Cupuaçu','Cupuaçu fruit', 30, 85.00);
INSERT INTO PRODUTO VALUES (26,'Carambola','Star fruit', 40, 25.00);
INSERT INTO PRODUTO VALUES (27,'Jabuticaba','Jabuticaba fruit', 50, 45.00);
INSERT INTO PRODUTO VALUES (28,'Tamarind','Tamarind fruit', 35, 30.00);
INSERT INTO PRODUTO VALUES (29,'Pequi','Pequi fruit', 25, 20.00);
INSERT INTO PRODUTO VALUES (30,'Cocoa','Cocoa fruit', 45, 55.00);
INSERT INTO PRODUTO VALUES (31,'Passiflora','Passion flower fruit', 40, 35.00);
INSERT INTO PRODUTO VALUES (32,'Abacaxi','Pineapple fruit', 35, 20.00);
INSERT INTO PRODUTO VALUES (33,'Morango','Strawberry', 50, 25.00);
INSERT INTO PRODUTO VALUES (34,'Limão','Lemon', 45, 15.00);
INSERT INTO PRODUTO VALUES (35,'Ameixa','Plum fruit', 40, 30.00);
