create table ranks(
    rank       serial not null primary key ,
    sr         serial not null,
    id         bigserial not null,
    name       varchar(30) not null
);

alter table ranks
    add constraint fk_users_ranks
    foreign key (id)
    references users(id);