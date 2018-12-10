package com.jk.fish.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;


/**
 * com.jk.fish.entity
 *
 * @author lise
 * @comment 水质监测数据表
 * @date 2018-12-10 10:22
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class WaterQualityMonit extends BaseEntity {


    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 采样点名称
     */
    private String monitSiteName;
    /**
     * 经度
     */
    private String eastLo;
    /**
     * 纬度
     */
    private String northLa;
    /**
     * 测线
     */
    private String locat;
    /**
     * 水深
     */
    private Double waterDep;
    /**
     * 监测日期
     */
    private java.util.Date monitDate;
    /**
     * 监测时间
     */
    private java.util.Date monitTime;
    /**
     * 水温
     */
    private Double waterTemper;
    /**
     * 水温指标方法
     */
    private String waterTemperMethod;
    /**
     * pH值
     */
    private Double ph;
    /**
     * 溶解氧
     */
    private Double dissOxyg;
    /**
     * 溶解氧指标方法
     */
    private String dissOxygMethod;
    /**
     * 悬浮物
     */
    private Double suspenSolid;
    /**
     * 悬浮物指标方法
     */
    private String suspenSolidMethod;
    /**
     * 总氮
     */
    private Double tn;
    /**
     * 总氮指标方法
     */
    private String tnMethod;
    /**
     * 总磷
     */
    private Double tp;
    /**
     * 总磷指标方法
     */
    private String tpMethod;
    /**
     * 氨氮
     */
    private Double nh3N;
    /**
     * 氨氮指标方法
     */
    private String nh3NMethod;
    /**
     * 硝酸盐氮
     */
    private Double no3N;
    /**
     * 硝酸盐氮指标方法
     */
    private String no3NMethod;
    /**
     * 亚硝酸盐氮
     */
    private Double no2N;
    /**
     * 亚硝酸盐氮指标方法
     */
    private String no2NMethod;
    /**
     * 氰化物
     */
    private Double cyanide;
    /**
     * 氰化物指标方法
     */
    private String cyanideMethod;
    /**
     * 氟化物
     */
    private Double fluoride;
    /**
     * 氟化物指标方法
     */
    private String fluorideMethod;
    /**
     * 硫化物
     */
    private Double sulfide;
    /**
     * 硫化物指标方法
     */
    private String sulfideMethod;
    /**
     * 高锰酸盐指数
     */
    private Double codmn;
    /**
     * 高锰酸盐指数指标方法
     */
    private String codmnMethod;
    /**
     * 化学需氧量
     */
    private Double cod;
    /**
     * 化学需氧量指标方法
     */
    private String codMethod;
    /**
     * 五日生化需氧量
     */
    private Double bod5;
    /**
     * 五日生化需氧量指标方法
     */
    private String bod5Method;
    /**
     * 铜
     */
    private Double cu;
    /**
     * 铜指标方法
     */
    private String cuMethod;
    /**
     * 锌
     */
    private Double zn;
    /**
     * 锌指标方法
     */
    private String znMethod;
    /**
     * 铅
     */
    private Double pb;
    /**
     * 铅指标方法
     */
    private String pbMethod;
    /**
     * 镉
     */
    private Double cd;
    /**
     * 镉指标方法
     */
    private String cdMethod;
    /**
     * 汞
     */
    private Double hg;
    /**
     * 汞指标方法
     */
    private String hgMethod;
    /**
     * 砷
     */
    private Double as1;
    /**
     * 砷指标方法
     */
    private String as1Method;
    /**
     * 六价铬
     */
    private Double cr6;
    /**
     * 六价铬指标方法
     */
    private String cr6Method;
    /**
     * 钙
     */
    private Double ca;
    /**
     * 钙指标方法
     */
    private String caMethod;
    /**
     * 镁
     */
    private Double mg;
    /**
     * 镁指标方法
     */
    private String mgMethod;
    /**
     * 非离子氨
     */
    private Double nonionAmmonia;
    /**
     * 非离子氨指标方法
     */
    private String nonionAmmoniaMethod;
    /**
     * 挥发性酚
     */
    private Double volatilePhenols;
    /**
     * 挥发性酚指标方法
     */
    private String volatilePhenolsMethod;
    /**
     * 石油类
     */
    private Double petroleum;
    /**
     * 石油类指标方法
     */
    private String petroleumMethod;
    /**
     * 叶绿素a
     */
    private Double chla;
    /**
     * 叶绿素a指标方法
     */
    private String chlaMethod;
    /**
     * 透明度
     */
    private Double ds;
    /**
     * 透明度指标方法
     */
    private String dsMethod;
    /**
     * 总硬度
     */
    private Double totalHardness;
    /**
     * 总硬度指标方法
     */
    private String totalHardnessMethod;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}
