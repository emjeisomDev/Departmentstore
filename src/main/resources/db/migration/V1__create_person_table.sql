CREATE TABLE tb_person (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    registration_date DATE NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    birth_date DATE NOT NULL,
    mothers_name VARCHAR(200) NOT NULL,
    gender CHAR(1) NOT NULL,
    is_deleted BOOLEAN DEFAULT FALSE,
    deleted_at TIMESTAMP NULL
);