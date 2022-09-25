-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Set-2022 às 17:50
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `livraria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `autores`
--

CREATE TABLE `autores` (
  `id` int(10) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `data_nasc` date NOT NULL,
  `nacionalidade` varchar(100) DEFAULT NULL,
  `biografia` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `edicao`
--

CREATE TABLE `edicao` (
  `id` int(10) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `preco` float(4,2) NOT NULL,
  `ano` date NOT NULL,
  `n_paginas` int(10) NOT NULL,
  `estoque` int(10) NOT NULL,
  `id_livro` int(10) NOT NULL,
  `id_editora` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `editoras`
--

CREATE TABLE `editoras` (
  `id` int(10) NOT NULL,
  `nome` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `enderecos_editora`
--

CREATE TABLE `enderecos_editora` (
  `id` int(10) NOT NULL,
  `rua` varchar(50) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `numero` int(10) NOT NULL,
  `id_editora` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livros`
--

CREATE TABLE `livros` (
  `id` int(10) NOT NULL,
  `codigo` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `lingua` varchar(100) NOT NULL,
  `ano` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro_autor`
--

CREATE TABLE `livro_autor` (
  `id` int(10) NOT NULL,
  `autor_id` int(10) NOT NULL,
  `livro_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `telefones_editora`
--

CREATE TABLE `telefones_editora` (
  `id` int(10) NOT NULL,
  `ddd` int(3) NOT NULL,
  `numero` int(9) NOT NULL,
  `id_editora` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `autores`
--
ALTER TABLE `autores`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `edicao`
--
ALTER TABLE `edicao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_livro` (`id_livro`),
  ADD KEY `id_editora` (`id_editora`);

--
-- Índices para tabela `editoras`
--
ALTER TABLE `editoras`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `enderecos_editora`
--
ALTER TABLE `enderecos_editora`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_editora` (`id_editora`);

--
-- Índices para tabela `livros`
--
ALTER TABLE `livros`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `livro_autor`
--
ALTER TABLE `livro_autor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `autor_id` (`autor_id`),
  ADD KEY `livro_id` (`livro_id`);

--
-- Índices para tabela `telefones_editora`
--
ALTER TABLE `telefones_editora`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_editora` (`id_editora`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `autores`
--
ALTER TABLE `autores`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `edicao`
--
ALTER TABLE `edicao`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `editoras`
--
ALTER TABLE `editoras`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `enderecos_editora`
--
ALTER TABLE `enderecos_editora`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `livros`
--
ALTER TABLE `livros`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `livro_autor`
--
ALTER TABLE `livro_autor`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `telefones_editora`
--
ALTER TABLE `telefones_editora`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `edicao`
--
ALTER TABLE `edicao`
  ADD CONSTRAINT `edicao_ibfk_1` FOREIGN KEY (`id_livro`) REFERENCES `livros` (`id`),
  ADD CONSTRAINT `edicao_ibfk_2` FOREIGN KEY (`id_editora`) REFERENCES `editoras` (`id`);

--
-- Limitadores para a tabela `enderecos_editora`
--
ALTER TABLE `enderecos_editora`
  ADD CONSTRAINT `enderecos_editora_ibfk_1` FOREIGN KEY (`id_editora`) REFERENCES `editoras` (`id`);

--
-- Limitadores para a tabela `livro_autor`
--
ALTER TABLE `livro_autor`
  ADD CONSTRAINT `livro_autor_ibfk_1` FOREIGN KEY (`autor_id`) REFERENCES `autores` (`id`),
  ADD CONSTRAINT `livro_autor_ibfk_2` FOREIGN KEY (`livro_id`) REFERENCES `livros` (`id`);

--
-- Limitadores para a tabela `telefones_editora`
--
ALTER TABLE `telefones_editora`
  ADD CONSTRAINT `telefones_editora_ibfk_1` FOREIGN KEY (`id_editora`) REFERENCES `editoras` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
