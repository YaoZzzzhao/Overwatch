create table season1(
    id                      bigserial not null primary key,
    name                    varchar(30) not null,
    damage_per_10mins       int not null,
    heal_per_10mins         int not null
);

alter table season1
    add constraint fk_users_season1
    foreign key (id)
    references users(id);
