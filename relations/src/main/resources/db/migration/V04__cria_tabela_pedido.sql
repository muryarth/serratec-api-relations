CREATE TABLE pedido (
    id_pedido serial primary key,
    descricao varchar(60),
    data_pedido timestamp,
    fk_usuario int,
    foreign key (fk_usuario) references usuario(id_usuario)
);