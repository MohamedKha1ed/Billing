CREATE TABLE IF NOT EXISTS products (
  id               bigserial not null primary key,
  name             varchar(255),
  price            double precision,
  category         varchar(255)
);