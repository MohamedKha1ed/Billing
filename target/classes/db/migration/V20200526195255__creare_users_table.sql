CREATE TABLE IF NOT EXISTS users (
  dtype            character varying(31) NOT NULL,
  id               bigserial not null primary key,
  name             varchar(255),
  email            varchar(255) unique NOT NULL,
  created_at       timestamp without time zone,
  updated_at       timestamp without time zone
);