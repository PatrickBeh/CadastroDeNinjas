-- V2: Migrations to add rank column in tb_cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);