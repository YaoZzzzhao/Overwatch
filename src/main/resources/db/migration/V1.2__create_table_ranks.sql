create table ranks(
    rank    int not null primary key,
    sr      int not null,
    id      bigserial not null,
    name    varchar(30)
);

alter table ranks
    add constraint fk_users_ranks
    foreign key (id)
    references users(id);