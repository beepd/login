drop table users;

commit;

create table users(
	username varchar(50) not null primary key,
	password varchar(200) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);

insert into users (username, password, enabled) values ('bob', '$2a$04$aI8S1JhcVIO1mZQ4LdlmxODnYGaenhuoTKSFmmR3eQxgm3vn18iV2', true);
insert into authorities (username, authority) values ('bob', 'ROLE_USER');

insert into users (username, password, enabled) values ('sara', '$2a$04$aI8S1JhcVIO1mZQ4LdlmxODnYGaenhuoTKSFmmR3eQxgm3vn18iV2', true);
insert into authorities (username, authority) values ('sara', 'ROLE_ADMIN');

commit;