create table season1 (
    id                  bigserial not null primary key,
    sr                  int not null,
    rank                varchar(15) not null,
    damage_per_10min    int not null,
    heal_per_10min      int not null
);

ALTER TABLE season1
    ADD CONSTRAINT fk_users_season1
    FOREIGN KEY (id)
    REFERENCES user(id);
