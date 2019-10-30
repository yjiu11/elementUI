package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author liushuai
 * @since 2019-06-04
 */
@Data
public class FmsBizImageInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.UUID)
    private String caseId;
    /**
     * 买房身份证正反面
     */
    private String buyIdUrl;
    /**
     * 配偶身份证正面
     */
    private String buySpouseIdUrl;
    /**
     * 户口本
     */
    private String buyRegistUrl;
    /**
     * 结婚证
     */
    private String buyMarigUrl;
    /**
     * 收入证
     */
    private String buyIncomeUrl;
    /**
     * 流水证
     */
    private String buyTradingUrl;
    /**
     * 征信证明
     */
    private String buyCredUrl;
    /**
     * 资产证明
     */
    private String buyAssetsUrl;
    /**
     * 缴税证
     */
    private String taxUrl;
    /**
     * 社保明细
     */
    private String socialUrl;
    /**
     * 营业执照文件路径
     */
    private String licUrl;
    /**
     * 公司章程
     */
    private String articleUrl;
    /**
     * 股东协议
     */
    private String shareholderUrl;
    /**
     * 法人身份证正面
     */
    private String legalIdUrl;
    /**
     * 购销合同
     */
    private String tradUrl;
    /**
     * 企业征信
     */
    private String comCredUrl;
    /**
     * 军人保障卡
     */
    private String soldierUrl;
    /**
     * 军官证明
     */
    private String officerUrl;
    /**
     * 军官证和身份证同一人证明
     */
    private String offiIdUrl;
    /**
     * 法人身份证正反面
     */
    private String sellIdUrl;
    /**
     * 配偶身份证正面
     */
    private String sellSpouseIdUrl;
    /**
     * 户口本
     */
    private String sellRegistUrl;
    /**
     * 结婚证
     */
    private String sellMarigUrl;
    /**
     * 卖方流水证
     */
    private String sellTradingUrl;
    /**
     * 首付款收据
     */
    private String downPayUrl;
    /**
     * 定金收据
     */
    private String depositUrl;
    /**
     * 委托公证
     */
    private String notarizUrl;
    /**
     * 不动产复印件
     */
    private String estateUrl;
    /**
     * 购房合同
     */
    private String purchHouseUrl;
    /**
     * 房产证
     */
    private String houseProperUrl;
    /**
     * 夫妻收入证明
     */
    private String sellCoupleIncomeUrl;
    /**
     * 征信证明
     */
    private String sellCredUrl;
    /**
     * 资产证明
     */
    private String sellAssetsUrl;
    /**
     * 共借人身份证正反面
     */
    private String togetIdUrl;
    /**
     * 配偶身份证正面
     */
    private String togetSpouseIdUrl;
    /**
     * 结婚证
     */
    private String togetMarigUrl;
    /**
     * 流水证
     */
    private String togetTradingUrl;
    /**
     * 夫妻收入证明
     */
    private String togetCoupleIncomeUrl;
    /**
     * 征信证明
     */
    private String togetCredUrl;
    /**
     * 共借人资产证明
     */
    private String togetAssetsUrl;

}
