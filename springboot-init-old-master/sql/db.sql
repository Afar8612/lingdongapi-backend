-- 创建库
create database if not exists lingdongapi;

-- 切换库
use lingdongapi;

-- 接口信息
create table if not exists lingdongapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment'名称',
    `description` varchar(256) null comment'描述',
    `url` varchar(512) not null comment'接口地址',
    `requestHeader` text null comment'请求头',
    `responseHeader` text null comment'响应头',
    `status` int default 0 not null comment'接口状态(0-关闭，1-开启)',
    `method` varchar(256) not null comment'请求类型',
    `userId` bigint not null comment'创建人',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment'创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment'更新时间',
    `isDelete` tinyint default 0 not null comment'是否删除(0-未删，1-已删)'
    )comment '接口信息';

insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (1, '武峻熙', '哈尔滨', 'www.eula-blick.biz', 'P3a', '7H8Ff', 0, '1kh', 1961326886, '2022-09-13 05:31:24', '2022-03-07 19:13:38', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (2, '魏擎宇', '徐州', 'www.blair-vandervort.info', 'OB2dg', 'WVt', 0, 'OX4fW', 9660707405, '2022-05-10 21:11:14', '2022-05-23 15:18:59', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (3, '孟智渊', '齐齐哈尔', 'www.tricia-carroll.io', 'wSO', '01', 0, '4Kwo2', 9, '2022-12-15 03:05:53', '2022-04-06 14:07:48', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (4, '熊智宸', '临沂', 'www.marshall-braun.biz', 'vylZk', 'Gfg', 0, 'HLcIo', 4, '2022-03-23 15:20:45', '2022-06-13 19:08:47', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (5, '黎皓轩', '遵义', 'www.lesley-monahan.com', 'uhKcD', 'aPaX', 0, '7h4', 914358442, '2022-02-02 18:51:08', '2022-07-25 14:03:02', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (6, '孙乐驹', '湛江', 'www.rosina-rempel.co', 'iAXs', 'IEa', 0, '2x0o7', 62633616, '2022-03-04 22:02:55', '2022-12-26 15:43:23', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (7, '赵驰', '三门峡', 'www.iona-williamson.name', '9z', 'gQ', 0, 'KTW', 1024, '2022-07-14 20:16:06', '2022-12-10 23:05:22', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (8, '袁思', '句容', 'www.vernon-prosacco.org', 'lhYP', '2c7', 0, '6wH7Y', 922459877, '2022-08-28 19:23:16', '2022-05-10 06:41:37', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (9, '唐绍辉', '诸暨', 'www.clinton-herzog.com', 'Mkayj', 'Ugo', 0, 'mm2', 971062, '2022-01-06 08:34:21', '2022-02-19 13:46:46', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (10, '周志强', '承德', 'www.sandy-grant.info', 'S1h', '8cuT', 0, 'S0Cev', 390, '2022-03-01 11:00:39', '2022-04-24 18:09:55', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (11, '董黎昕', '连云港', 'www.blythe-mueller.io', '7yO', 'fKKgt', 0, 'rc', 6574, '2022-05-03 04:57:11', '2022-12-03 22:31:43', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (12, '魏睿渊', '贵阳', 'www.yuki-huel.net', 'OJ', '8RM', 0, 'JQ', 3875644, '2022-06-18 14:48:26', '2022-10-13 00:07:43', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (13, '吴昊焱', '徐州', 'www.sang-rohan.net', 'US', 'r8Iu1', 0, 'gt1ya', 79058979, '2022-02-20 18:34:03', '2022-09-24 03:29:51', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (14, '余靖琪', '大同', 'www.jonah-prohaska.com', 'HOJ', 'zO7V', 0, 'EJNv', 1020831, '2022-01-01 19:38:17', '2022-10-18 01:03:08', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (15, '余明杰', '肇庆', 'www.louis-leannon.org', 'ss5O', 'Z8mb', 0, 'tecR6', 8144, '2022-03-22 08:34:42', '2022-02-27 05:49:57', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (16, '石懿轩', '吉林', 'www.kenneth-jenkins.info', 'cjes', 'jWx', 0, 'CAR', 9060312068, '2022-09-12 21:15:45', '2022-05-23 17:03:21', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (17, '朱健雄', '秦皇岛', 'www.vivien-cormier.io', 'AG7Ax', 'BBj', 0, 'AfY', 81974, '2022-10-31 01:04:39', '2022-10-11 04:00:54', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (18, '蒋明杰', '日照', 'www.jules-hermann.io', 'GvQ6', 'mJ0Fn', 0, 'Dk', 600518674, '2022-08-16 08:47:45', '2022-12-13 02:04:51', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (19, '程天翊', '玉溪', 'www.nelda-beer.info', '4Q3k', 'qqfD', 0, 'K58', 319904, '2022-11-18 08:55:13', '2022-08-03 05:00:50', 0);
insert into lingdongapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (20, '龚熠彤', '岳阳', 'www.ali-wyman.org', 'szii', 'xY', 0, 'v2NGQ', 22137972, '2022-08-05 12:58:23', '2022-08-08 19:15:16', 0);