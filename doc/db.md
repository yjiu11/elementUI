create table fms_biz_account_info
(
  case_id            varchar(64)   primary key,
  corecom_type   varchar(2)     default ‘’ comment ’核心企业类型’,
  corecom_nm     varchar(64)     default ‘’ comment ’核心企业名称’,
   corecom_lic_code varchar(18) default ‘’comment ’核心企业营业执照代码’,
   corecom_city  varchar(18)  default ‘’comment ’核心企业所在区域’,
  acct_amt                decimal(24,2)  default 0.00 comment ‘账款金额’，
  acct_desc               varchar(640)  default ‘’ comment ‘账款描述’
   create_time      datetime                not null,
  update_time      datetime                not null
)
  comment ‘账款信息表';

1.案件号；2.核心企业类型 ；3.核心企业名称；4.核心企业营业执照代码；5、核心企业所在区域；6.账款金额；7.账款描述