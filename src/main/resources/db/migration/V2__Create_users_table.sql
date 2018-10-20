CREATE TABLE users (
	username VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	role VARCHAR(50) NOT NULL,
	enabled TINYINT NOT NULL
);


COMMIT;


INSERT INTO users(username,password,role,enabled) VALUES ('admin','pass','ROLE_ADMIN', 1);
INSERT INTO users(username,password,role,enabled) VALUES ('super','pass','ROLE_SUPER', 1);
INSERT INTO users(username,password,role,enabled) VALUES ('krishna','pass','ROLE_USER', 1);
INSERT INTO users(username,password,role,enabled)VALUES ('sanaulla','pass','ROLE_USER', 1);

COMMIT;