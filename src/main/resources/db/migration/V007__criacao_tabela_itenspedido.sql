CREATE TABLE ITENS_PEDIDO (
	id BIGINT NOT NULL AUTO_INCREMENT,
    quantidade BIGINT NOT NULL,
    id_pedido  BIGINT NOT NULL,
	id_produto BIGINT NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE ITENS_PEDIDO ADD CONSTRAINT itenspedido_pedido_fk FOREIGN KEY(id_pedido) REFERENCES PEDIDO (id);

ALTER TABLE ITENS_PEDIDO ADD CONSTRAINT itenspedido_produto_fk FOREIGN KEY(id_produto) REFERENCES PRODUTO (id);

INSERT INTO ITENS_PEDIDO VALUES(1, 10, 1,7);
INSERT INTO ITENS_PEDIDO VALUES(2, 20, 2, 5);
INSERT INTO ITENS_PEDIDO VALUES(3, 30, 3, 3);
INSERT INTO ITENS_PEDIDO VALUES(4, 40, 4, 8);
INSERT INTO ITENS_PEDIDO VALUES(5, 15, 5, 5);
INSERT INTO ITENS_PEDIDO VALUES(6, 25, 6, 6);
INSERT INTO ITENS_PEDIDO VALUES(7, 35, 7, 11);
INSERT INTO ITENS_PEDIDO VALUES(8, 45, 8, 9);
INSERT INTO ITENS_PEDIDO VALUES(9, 55, 9, 9);
INSERT INTO ITENS_PEDIDO VALUES(10, 65, 10,10);
INSERT INTO ITENS_PEDIDO VALUES(11, 75, 11, 5);
