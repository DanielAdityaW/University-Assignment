-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Des 2020 pada 02.36
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes_prak_platform_youtube`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `10channel`
--

CREATE TABLE `10channel` (
  `rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `negara` char(50) DEFAULT NULL,
  `jumlah_video` int(11) DEFAULT NULL,
  `subscribers` double DEFAULT NULL,
  `views` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `10channel`
--

INSERT INTO `10channel` (`rank`, `nama channel`, `negara`, `jumlah_video`, `subscribers`, `views`) VALUES
(1, 'Cocomelon - Nursery Rhymes', 'Amerika Serikat', 590, 100000000, 87345835508),
(2, '✿ Kids Diana Show', 'Amerika Serikat', 797, 71100000, 47336362803),
(3, 'Ed Sheeran', 'Britania Raya', 161, 46300000, 21422020598),
(4, 'Mister Max', 'Britania Raya', 898, 19900000, 11271806581),
(5, 'Fischers-フィッシャーズ-', 'Jepang', 2, 6530000, 10830614845),
(6, '東海オンエア', 'Jepang', 1790, 5640000, 7371442096),
(7, 'CKN Toys', 'Australia', 730, 16600000, 16268526526),
(8, 'Bounce Patrol - Kids Songs', 'Australia', 182, 19700000, 11597583058),
(9, 'TRANS7 OFFICIAL', 'Indonesia', 58340, 17600000, 8015109305),
(10, 'Indosiar', 'Indonesia', 46619, 15300000, 7895989417);

-- --------------------------------------------------------

--
-- Struktur dari tabel `10subscibers`
--

CREATE TABLE `10subscibers` (
  `rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `negara` char(50) DEFAULT NULL,
  `subscribers` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `10subscibers`
--

INSERT INTO `10subscibers` (`rank`, `nama channel`, `negara`, `subscribers`) VALUES
(1, 'Cocomelon - Nursery Rhymes', 'Amerika Serikat', 100000000),
(2, '✿ Kids Diana Show', 'Amerika Serikat', 71700000),
(3, 'WWE', 'Amerika Serikat', 70800000),
(4, 'Like Nastya', 'Amerika Serikat', 65800000),
(5, 'Vlad and Nik', 'Amerika Serikat', 59900000),
(6, 'Ed Sheeran', 'Britania Raya', 46300000),
(7, 'Toys and Colors', 'Amerika Serikat', 27700000),
(8, 'Atta Halilintar', 'Indonesia', 26100000),
(9, 'Mr Bean', 'Britania Raya', 25100000),
(10, 'Ricis Official', 'Indonesia', 23400000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `10upload`
--

CREATE TABLE `10upload` (
  `rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `negara` char(50) DEFAULT NULL,
  `jumlah_video` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `10upload`
--

INSERT INTO `10upload` (`rank`, `nama channel`, `negara`, `jumlah_video`) VALUES
(1, 'TRANS7 OFFICIAL', 'Indonesia', 58340),
(2, 'WWE', 'Amerika Serikat', 51708),
(3, 'Indosiar', 'Indonesia', 46619),
(4, 'BBC', 'Britania Raya', 12863),
(5, 'ゆうぴょん yupyon', 'Jepang', 4160),
(6, 'Cartoon Network UK', 'Britania Raya', 4146),
(7, 'Lachlan', 'Australia', 3461),
(8, 'DisneyChannelUK', 'Britania Raya', 3153),
(9, 'せんももあいしーCh Sen, Mo…', 'Jepang', 2908),
(10, 'DisneyJuniorUK', 'Britania Raya', 2662);

-- --------------------------------------------------------

--
-- Struktur dari tabel `10views`
--

CREATE TABLE `10views` (
  `rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `negara` char(50) DEFAULT NULL,
  `views` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `10views`
--

INSERT INTO `10views` (`rank`, `nama channel`, `negara`, `views`) VALUES
(1, 'Cocomelon - Nursery Rhymes', 'Amerika Serikat', 87345835508),
(2, 'WWE', 'Amerika Serikat', 52699444792),
(3, 'Like Nastya', 'Amerika Serikat', 48588326514),
(4, '✿ Kids Diana Show', 'Amerika Serikat', 47336362803),
(5, 'Vlad and Niki', 'Amerika Serikat', 40101684190),
(6, 'Toys and Colors', 'Amerika Serikat', 23490737821),
(7, 'Ed Sheeran', 'Britania Raya', 21422020598),
(8, 'CKN Toys', 'Australia', 16268526526),
(9, 'Bounce Patrol - Kids Songs', 'Australia', 11597583058),
(10, 'Mister Max', 'Britania Raya', 11271806581);

-- --------------------------------------------------------

--
-- Struktur dari tabel `region`
--

CREATE TABLE `region` (
  `no` int(20) NOT NULL,
  `negara` char(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `region`
--

INSERT INTO `region` (`no`, `negara`) VALUES
(1, 'Jepang'),
(2, 'Amerika Serikat'),
(3, 'Britania Raya'),
(4, 'Indonesia'),
(5, 'Australia'),
(6, 'Thailand'),
(7, 'Korea Selatan'),
(8, 'Kanada'),
(9, 'Jerman'),
(10, 'Singapura');

-- --------------------------------------------------------

--
-- Struktur dari tabel `yt_au`
--

CREATE TABLE `yt_au` (
  `Rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `subcribers` double DEFAULT NULL,
  `views` double DEFAULT NULL,
  `jumlah_video` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `yt_au`
--

INSERT INTO `yt_au` (`Rank`, `nama channel`, `subcribers`, `views`, `jumlah_video`) VALUES
(1, 'Bounce Patrol - Kids Songs', 19700000, 11597583058, 182),
(2, 'LazarBeam', 17500000, 6675588985, 1210),
(3, 'CKN Toys', 16600000, 16268526526, 730),
(4, 'Chloe Ting', 16500000, 1532011547, 300),
(5, 'HowToBasic', 15600000, 2911827420, 542),
(6, 'Lachlan', 14400000, 4550212261, 3461),
(7, 'Primitive Technology', 10300000, 941735334, 51),
(8, 'Muselk', 9510000, 3514545326, 1842),
(9, 'JoshDub', 8380000, 994524204, 215),
(10, 'Troye Sivan', 7330000, 267968979, 143);

-- --------------------------------------------------------

--
-- Struktur dari tabel `yt_id`
--

CREATE TABLE `yt_id` (
  `Rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `subcribers` double DEFAULT NULL,
  `views` double DEFAULT NULL,
  `jumlah_video` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `yt_id`
--

INSERT INTO `yt_id` (`Rank`, `nama channel`, `subcribers`, `views`, `jumlah_video`) VALUES
(1, 'Atta Halilintar', 26100000, 2991238696, 1117),
(2, 'Ricis Official', 23400000, 3379488410, 1158),
(3, 'Jess No Limit', 19700000, 1979793269, 1344),
(4, 'Rans Entertainment', 18700000, 3451549192, 1791),
(5, 'TRANS7 OFFICIAL', 17600000, 8015109305, 58340),
(6, 'Baim Paula', 17100000, 2614250246, 1104),
(7, 'GEN HALILINTAR', 17100000, 2721680211, 782),
(8, 'Frost Diamond', 15700000, 2829135421, 1342),
(9, 'Indosiar', 15300000, 7895989417, 46619),
(10, 'Naisa Alifia Yuriza (N.A.Y)', 14800000, 1337709239, 772);

-- --------------------------------------------------------

--
-- Struktur dari tabel `yt_jp`
--

CREATE TABLE `yt_jp` (
  `Rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `subcribers` double DEFAULT NULL,
  `views` double DEFAULT NULL,
  `jumlah_video` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `yt_jp`
--

INSERT INTO `yt_jp` (`Rank`, `nama channel`, `subcribers`, `views`, `jumlah_video`) VALUES
(1, 'Junya.じゅんや', 2920000, 933596367, 272),
(2, 'ジェフの翻訳・復活中', 346000, 128497761, 231),
(3, 'ゆうぴょん yupyon', 868000, 737413700, 4160),
(4, '東海オンエア', 5640000, 7371442096, 1790),
(5, 'Toy Kids★トイキッズ', 1240000, 3238386664, 1629),
(6, '【公式】グレープカンパ�…', 810000, 336588802, 207),
(7, 'Fischers-フィッシャーズ-', 6530000, 10830614845, 2243),
(8, '公式チャンネルTHE OUTSIDER', 53200, 2845108, 21),
(9, 'せんももあいしーCh Sen, Mo…', 9190000, 6537978376, 2908),
(10, 'HIMAWARIちゃんねる', 2470000, 4766313949, 1597);

-- --------------------------------------------------------

--
-- Struktur dari tabel `yt_uk`
--

CREATE TABLE `yt_uk` (
  `Rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `subcribers` double DEFAULT NULL,
  `views` double DEFAULT NULL,
  `jumlah_video` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `yt_uk`
--

INSERT INTO `yt_uk` (`Rank`, `nama channel`, `subcribers`, `views`, `jumlah_video`) VALUES
(1, 'DisneyChannelUK', 7620000, 7519479864, 3153),
(2, 'Mister Max', 19900000, 11271806581, 898),
(3, 'Cartoon Network UK', 73900000, 6692601393, 4146),
(4, 'Marcus Butler', 4010000, 103796815, 40),
(5, 'ernie last', 1770000, 809882120, 1149),
(6, 'Dua Lipa', 16300000, 6047610326, 135),
(7, 'Ed Sheeran', 46300000, 21422020598, 161),
(8, 'DisneyJuniorUK', 9310000, 10415025206, 2662),
(9, 'Mr Bean', 25100000, 7888474139, 2020),
(10, 'BBC', 10100000, 7463, 12863);

-- --------------------------------------------------------

--
-- Struktur dari tabel `yt_us`
--

CREATE TABLE `yt_us` (
  `Rank` int(20) NOT NULL,
  `nama channel` char(50) DEFAULT NULL,
  `subcribers` double DEFAULT NULL,
  `views` double DEFAULT NULL,
  `jumlah_video` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `yt_us`
--

INSERT INTO `yt_us` (`Rank`, `nama channel`, `subcribers`, `views`, `jumlah_video`) VALUES
(1, '위드키즈 토이즈 [With Kids …', 3640000, 1564703448, 351),
(2, '✿ Kids Diana Show', 71700000, 47336362803, 797),
(3, 'Cocomelon - Nursery Rhymes', 100000000, 87345835508, 590),
(4, 'Vlad and Niki', 59900000, 40101684190, 311),
(5, 'Like Nastya', 65800000, 48588326514, 521),
(6, 'Toys and Colors', 27700000, 23490737821, 524),
(7, 'DONA 도나', 9570000, 8725215688, 137),
(8, 'WWE', 70800000, 52699444792, 51708),
(9, 'Hot for Words', 383000, 489243076, 672),
(10, 'After Party', 394000, 714135901, 207);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `10channel`
--
ALTER TABLE `10channel`
  ADD PRIMARY KEY (`rank`);

--
-- Indeks untuk tabel `10subscibers`
--
ALTER TABLE `10subscibers`
  ADD PRIMARY KEY (`rank`);

--
-- Indeks untuk tabel `10upload`
--
ALTER TABLE `10upload`
  ADD PRIMARY KEY (`rank`);

--
-- Indeks untuk tabel `10views`
--
ALTER TABLE `10views`
  ADD PRIMARY KEY (`rank`);

--
-- Indeks untuk tabel `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`no`);

--
-- Indeks untuk tabel `yt_au`
--
ALTER TABLE `yt_au`
  ADD PRIMARY KEY (`Rank`);

--
-- Indeks untuk tabel `yt_id`
--
ALTER TABLE `yt_id`
  ADD PRIMARY KEY (`Rank`);

--
-- Indeks untuk tabel `yt_jp`
--
ALTER TABLE `yt_jp`
  ADD PRIMARY KEY (`Rank`);

--
-- Indeks untuk tabel `yt_uk`
--
ALTER TABLE `yt_uk`
  ADD PRIMARY KEY (`Rank`);

--
-- Indeks untuk tabel `yt_us`
--
ALTER TABLE `yt_us`
  ADD PRIMARY KEY (`Rank`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `region`
--
ALTER TABLE `region`
  ADD CONSTRAINT `region_ibfk_1` FOREIGN KEY (`no`) REFERENCES `yt_au` (`Rank`),
  ADD CONSTRAINT `region_ibfk_2` FOREIGN KEY (`no`) REFERENCES `yt_id` (`Rank`),
  ADD CONSTRAINT `region_ibfk_3` FOREIGN KEY (`no`) REFERENCES `yt_jp` (`Rank`),
  ADD CONSTRAINT `region_ibfk_4` FOREIGN KEY (`no`) REFERENCES `yt_uk` (`Rank`),
  ADD CONSTRAINT `region_ibfk_5` FOREIGN KEY (`no`) REFERENCES `yt_us` (`Rank`);

--
-- Ketidakleluasaan untuk tabel `yt_au`
--
ALTER TABLE `yt_au`
  ADD CONSTRAINT `yt_au_ibfk_1` FOREIGN KEY (`Rank`) REFERENCES `10channel` (`rank`),
  ADD CONSTRAINT `yt_au_ibfk_2` FOREIGN KEY (`Rank`) REFERENCES `10subscibers` (`rank`),
  ADD CONSTRAINT `yt_au_ibfk_3` FOREIGN KEY (`Rank`) REFERENCES `10upload` (`rank`),
  ADD CONSTRAINT `yt_au_ibfk_4` FOREIGN KEY (`Rank`) REFERENCES `10views` (`rank`);

--
-- Ketidakleluasaan untuk tabel `yt_id`
--
ALTER TABLE `yt_id`
  ADD CONSTRAINT `yt_id_ibfk_1` FOREIGN KEY (`Rank`) REFERENCES `10channel` (`rank`),
  ADD CONSTRAINT `yt_id_ibfk_2` FOREIGN KEY (`Rank`) REFERENCES `10subscibers` (`rank`),
  ADD CONSTRAINT `yt_id_ibfk_3` FOREIGN KEY (`Rank`) REFERENCES `10upload` (`rank`),
  ADD CONSTRAINT `yt_id_ibfk_4` FOREIGN KEY (`Rank`) REFERENCES `10views` (`rank`);

--
-- Ketidakleluasaan untuk tabel `yt_jp`
--
ALTER TABLE `yt_jp`
  ADD CONSTRAINT `yt_jp_ibfk_1` FOREIGN KEY (`Rank`) REFERENCES `10channel` (`rank`),
  ADD CONSTRAINT `yt_jp_ibfk_2` FOREIGN KEY (`Rank`) REFERENCES `10subscibers` (`rank`),
  ADD CONSTRAINT `yt_jp_ibfk_3` FOREIGN KEY (`Rank`) REFERENCES `10upload` (`rank`),
  ADD CONSTRAINT `yt_jp_ibfk_4` FOREIGN KEY (`Rank`) REFERENCES `10views` (`rank`);

--
-- Ketidakleluasaan untuk tabel `yt_uk`
--
ALTER TABLE `yt_uk`
  ADD CONSTRAINT `yt_uk_ibfk_1` FOREIGN KEY (`Rank`) REFERENCES `10channel` (`rank`),
  ADD CONSTRAINT `yt_uk_ibfk_2` FOREIGN KEY (`Rank`) REFERENCES `10subscibers` (`rank`),
  ADD CONSTRAINT `yt_uk_ibfk_3` FOREIGN KEY (`Rank`) REFERENCES `10upload` (`rank`),
  ADD CONSTRAINT `yt_uk_ibfk_4` FOREIGN KEY (`Rank`) REFERENCES `10views` (`rank`);

--
-- Ketidakleluasaan untuk tabel `yt_us`
--
ALTER TABLE `yt_us`
  ADD CONSTRAINT `yt_us_ibfk_1` FOREIGN KEY (`Rank`) REFERENCES `10channel` (`rank`),
  ADD CONSTRAINT `yt_us_ibfk_2` FOREIGN KEY (`Rank`) REFERENCES `10subscibers` (`rank`),
  ADD CONSTRAINT `yt_us_ibfk_3` FOREIGN KEY (`Rank`) REFERENCES `10upload` (`rank`),
  ADD CONSTRAINT `yt_us_ibfk_4` FOREIGN KEY (`Rank`) REFERENCES `10views` (`rank`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
