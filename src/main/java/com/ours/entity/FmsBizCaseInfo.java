package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 案件信息表
 * </p>
 *
 * @author liushuai
 * @since 2019-05-20
 */
@Data
public class FmsBizCaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.UUID)
    private String caseId;
    /**
     * 买方客户号
     */
    private String buyerCustNo;
    /**
     * 客户名
     */
    private String buyerCustNm;
    /**
     * 买方客户号
     */
    private String sellerCustNo;
    /**
     * 客户名
     */
    private String sellerCustNm;
    /**
     * 贷款金额
     */
    private String loanAmt;
    /**
     * 可接受利率
     */
    private String financRateAccept;
    /**
     * 联系人电话
     */
    private String linkPhone;
    /**
     * 是否赎楼
     */
    private String redemptFlag;

    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 县
     */
    private String county;
    /**
     * 抢件意见
     */
    private String advice;


    private Date createTime;
    private Date updateTime;


    /**
     * 省
     */
    @TableField(exist = false)
    private String provinceCode;

    /**
     * 市
     */
    @TableField(exist = false)
    private String cityCode;

    /**
     * 县
     */
    @TableField(exist = false)
    private String countyCode;


    /**
     * 买房身份证正反面
     */
    @TableField(exist = false)
    private String buyIdUrl;
    /**
     * 配偶身份证正面
     */
    @TableField(exist = false)
    private String buySpouseIdUrl;
    /**
     * 户口本
     */
    @TableField(exist = false)
    private String buyRegistUrl;
    /**
     * 结婚证
     */
    @TableField(exist = false)
    private String buyMarigUrl;
    /**
     * 收入证
     */
    @TableField(exist = false)
    private String buyIncomeUrl;
    /**
     * 流水证
     */
    @TableField(exist = false)
    private String buyTradingUrl;
    /**
     * 征信证明
     */
    @TableField(exist = false)
    private String buyCredUrl;
    /**
     * 资产证明
     */
    @TableField(exist = false)
    private String buyAssetsUrl;
    /**
     * 缴税证
     */
    @TableField(exist = false)
    private String taxUrl;
    /**
     * 社保明细
     */
    @TableField(exist = false)
    private String socialUrl;
    /**
     * 营业执照文件路径
     */
    @TableField(exist = false)
    private String licUrl;
    /**
     * 公司章程
     */
    @TableField(exist = false)
    private String articleUrl;
    /**
     * 股东协议
     */
    @TableField(exist = false)
    private String shareholderUrl;
    /**
     * 法人身份证正面
     */
    @TableField(exist = false)
    private String legalIdUrl;
    /**
     * 购销合同
     */
    @TableField(exist = false)
    private String tradUrl;
    /**
     * 企业征信
     */
    @TableField(exist = false)
    private String comCredUrl;
    /**
     * 军人保障卡
     */
    @TableField(exist = false)
    private String soldierUrl;
    /**
     * 军官证明
     */
    @TableField(exist = false)
    private String officerUrl;
    /**
     * 军官证和身份证同一人证明
     */
    @TableField(exist = false)
    private String offiIdUrl;
    /**
     * 法人身份证正反面
     */
    @TableField(exist = false)
    private String sellIdUrl;
    /**
     * 配偶身份证正面
     */
    @TableField(exist = false)
    private String sellSpouseIdUrl;
    /**
     * 户口本
     */
    @TableField(exist = false)
    private String sellRegistUrl;
    /**
     * 结婚证
     */
    @TableField(exist = false)
    private String sellMarigUrl;
    /**
     * 卖方流水证
     */
    @TableField(exist = false)
    private String sellTradingUrl;
    /**
     * 首付款收据
     */
    @TableField(exist = false)
    private String downPayUrl;
    /**
     * 定金收据
     */
    @TableField(exist = false)
    private String depositUrl;
    /**
     * 委托公证
     */
    @TableField(exist = false)
    private String notarizUrl;
    /**
     * 不动产复印件
     */
    @TableField(exist = false)
    private String estateUrl;
    /**
     * 购房合同
     */
    @TableField(exist = false)
    private String purchHouseUrl;
    /**
     * 房产证
     */
    @TableField(exist = false)
    private String houseProperUrl;
    /**
     * 夫妻收入证明
     */
    @TableField(exist = false)
    private String sellCoupleIncomeUrl;
    /**
     * 征信证明
     */
    @TableField(exist = false)
    private String sellCredUrl;
    /**
     * 资产证明
     */
    @TableField(exist = false)
    private String sellAssetsUrl;
    /**
     * 共借人身份证正反面
     */
    @TableField(exist = false)
    private String togetIdUrl;
    /**
     * 配偶身份证正面
     */
    @TableField(exist = false)
    private String togetSpouseIdUrl;
    /**
     * 结婚证
     */
    @TableField(exist = false)
    private String togetMarigUrl;
    /**
     * 流水证
     */
    @TableField(exist = false)
    private String togetTradingUrl;
    /**
     * 夫妻收入证明
     */
    @TableField(exist = false)
    private String togetCoupleIncomeUrl;
    /**
     * 征信证明
     */
    @TableField(exist = false)
    private String togetCredUrl;
    /**
     * 共借人资产证明
     */
    @TableField(exist = false)
    private String togetAssetsUrl;
}
