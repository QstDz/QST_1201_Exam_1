题目3：编写MapReduce，统计这两个文件

`/user/hadoop/mapred_dev_double/ip_time`

`/user/hadoop/mapred_dev_double/ip_time_2`

当中，重复出现的IP的数量(40分)

---
加分项：

1. 写出程序里面考虑到的优化点，每个优化点+5分。
2. 额外使用Hive实现，+5分。
3. 额外使用HBase实现，+5分。

hive:
    create table if not exists dz_1(
      ip string,
      time string
    )row format delimited
    fields terminated by '\t'
    stored as textfile;
    
    load data inpath'/user/hadoop/dongzhuang/hive/ip_time' into table dz_1;
    
    create table if not exists dz_2(
      ip string,
      time string
    )row format delimited
    fields terminated by '\t'
    stored as textfile;
    
    load data inpath'/user/hadoop/dongzhuang/hive/ip_time_2' into table dz_2;
    
  (select count(distinct a.ip) from dz_1 a join dz_2 b on a.ip=b.ip;
  550
