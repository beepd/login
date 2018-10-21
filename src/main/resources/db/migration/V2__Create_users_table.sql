CREATE TABLE users (
	username VARCHAR(50) NOT NULL,
	password VARCHAR(100) NOT NULL,
	role VARCHAR(50) NOT NULL,
	enabled TINYINT NOT NULL
);


COMMIT;


INSERT INTO users(username,password,role,enabled) VALUES ('admin','$2a$04$/XDX0p.rh8MZMjf8O17wGOFiznTGkqffQuiRUc/gDKrpdu/bdqSQS','ROLE_ADMIN', 1);
INSERT INTO users(username,password,role,enabled) VALUES ('super','$2a$04$/XDX0p.rh8MZMjf8O17wGOFiznTGkqffQuiRUc/gDKrpdu/bdqSQS','ROLE_SUPER', 1);
INSERT INTO users(username,password,role,enabled) VALUES ('krishna','$2a$04$/XDX0p.rh8MZMjf8O17wGOFiznTGkqffQuiRUc/gDKrpdu/bdqSQS','ROLE_USER', 1);
INSERT INTO users(username,password,role,enabled)VALUES ('sanaulla','$2a$04$/XDX0p.rh8MZMjf8O17wGOFiznTGkqffQuiRUc/gDKrpdu/bdqSQS','ROLE_USER', 1);

COMMIT;