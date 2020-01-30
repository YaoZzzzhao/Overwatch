create table users(
    id      bigserial not null primary key,
    name    varchar(30) not null,
    sr      int not null,
    rank    varchar(15) not null
);