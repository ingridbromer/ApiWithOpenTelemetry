\c provider1


CREATE TABLE voo (
  id              SERIAL PRIMARY KEY,
  origem CHAR(3) NOT NULL,
  destino CHAR(3) NOT NULL,
  empresa VARCHAR(40) NOT NULL,
  dataPartida timestamp NOT NULL);

INSERT INTO
	voo(origem, destino, empresa, dataPartida)
VALUES
  ('RJ', 'SP', 'GOL', '2022-09-30 12:00:00'),
  ('RJ', 'SP', 'LATAM', '2022-09-30 12:00:00'),
  ('RJ', 'SP', 'AZUL', '2022-09-30 12:00:00');