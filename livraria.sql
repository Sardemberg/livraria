-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 20-Out-2022 às 23:43
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

--
-- Extraindo dados da tabela `autores`
--

INSERT INTO `autores` (`id`, `nome`, `data_nasc`, `nacionalidade`, `biografia`) VALUES
(1, 'Hadassa Kiria', '2003-03-25', 'Espanha', 'Um homem e seu aprendiz 2'),
(8, 'Jamba Sardemberg', '2003-02-26', 'Brasileiro', 'o homi, a maquina'),
(11, 'TEstando', '1940-07-09', 'Inglesa', 'AAAAA'),
(12, 'Jamba Karateka', '2003-02-04', 'Canadadesse', 'Caneta azul, azul caneta');

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

--
-- Extraindo dados da tabela `edicao`
--

INSERT INTO `edicao` (`id`, `isbn`, `preco`, `ano`, `n_paginas`, `estoque`, `id_livro`, `id_editora`) VALUES
(1, '123768', 75.78, '0000-00-00', 500, 6, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `editoras`
--

CREATE TABLE `editoras` (
  `id` int(10) NOT NULL,
  `nome` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `editoras`
--

INSERT INTO `editoras` (`id`, `nome`) VALUES
(1, 'Medusa');

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

--
-- Extraindo dados da tabela `enderecos_editora`
--

INSERT INTO `enderecos_editora` (`id`, `rua`, `cep`, `numero`, `id_editora`) VALUES
(1, 'Gonçalves tristão', '63122654', 47, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `livros`
--

CREATE TABLE `livros` (
  `id` int(10) NOT NULL,
  `codigo` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `lingua` varchar(100) NOT NULL,
  `ano` int(11) DEFAULT NULL,
  `autor` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `livros`
--

INSERT INTO `livros` (`id`, `codigo`, `nome`, `lingua`, `ano`, `autor`) VALUES
(1, '123456', 'Luiza', 'Inglês', 2022, NULL),
(3, '123456', 'Testando', 'Inglês', 2022, 'Hadassa Kiria'),
(4, '7022ACB', 'Livro teste 2', 'Inglês', 2022, 'Hadassa Kiria'),
(6, '75279', 'Olá, esse é um nome', 'Inglês', 2003, 'Lui'),
(7, 'Não exite', 'TEstando título', 'Brazil', 1901, 'Lucas Sardemberg'),
(8, '5556', 'O segredo das Jambas', 'Jabanes', 2022, 'Jamba Karateka');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro_autor`
--

CREATE TABLE `livro_autor` (
  `id` int(10) NOT NULL,
  `autor_id` int(10) NOT NULL,
  `livro_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `livro_autor`
--

INSERT INTO `livro_autor` (`id`, `autor_id`, `livro_id`) VALUES
(1, 1, 1);

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
-- Extraindo dados da tabela `telefones_editora`
--

INSERT INTO `telefones_editora` (`id`, `ddd`, `numero`, `id_editora`) VALUES
(1, 88, 99003322, 1);

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
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `edicao`
--
ALTER TABLE `edicao`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `editoras`
--
ALTER TABLE `editoras`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `enderecos_editora`
--
ALTER TABLE `enderecos_editora`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `livros`
--
ALTER TABLE `livros`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `livro_autor`
--
ALTER TABLE `livro_autor`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `telefones_editora`
--
ALTER TABLE `telefones_editora`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
