package com.izhbg.typz.shop.goods.dto;import java.util.Date;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.Id;import javax.persistence.Table;import org.hibernate.annotations.GenericGenerator;/******************************************************************************* * javaBeans * t_sh_goods_detail --> TShGoodsDetail  * <table explanation> * @author 2016-06-15 10:56:14 *  */	@Entity@Table(name = "t_sh_goods_detail")public class TShGoodsDetail implements java.io.Serializable {	//field	/**  **/	@Id	@GenericGenerator(name = "paymentableGenerator", strategy = "assigned")   	private String id;	/** 版本号 **/	private Integer version;	/** 商品基本信息外键 **/	@Column(name = "goods_id" )	private String goodsId;	/** 商品详情 **/	private String content;	/** 销售状态 **/	@Column(name = "sale_status" )	private Integer saleStatus;	/** 库存状态 **/	@Column(name = "stock_status" )	private Integer stockStatus;	/** 提审时间 **/	@Column(name = "to_pro_time" )	private Date toProTime;	/** 上架时间 **/	@Column(name = "on_sale_time" )	private Date onSaleTime;	/** 下架时间 **/	@Column(name = "un_sale_time" )	private Date unSaleTime;	/** 删除状态 **/	@Column(name = "del_status" )	private Integer delStatus;	/** 删除时间 **/	@Column(name = "del_time" )	private Date delTime;	/** 审核状态 **/	@Column(name = "pro_status" )	private Integer proStatus;	/** 审核原因 **/	@Column(name = "unpro_reason" )	private String unproReason;	/** 审核时间 **/	@Column(name = "pro_time" )	private Date proTime;	/** 默认价格 **/	@Column(name = "default_price" )	private Double defaultPrice;	/** 销售数量 **/	@Column(name = "sale_count" )	private Integer saleCount;	/** 浏览数量 **/	@Column(name = "view_count" )	private Integer viewCount;	//method	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public Integer getVersion() {		return version;	}	public void setVersion(Integer version) {		this.version = version;	}		public String getGoodsId() {		return goodsId;	}	public void setGoodsId(String goodsId) {		this.goodsId = goodsId;	}	public String getContent() {		return content;	}	public void setContent(String content) {		this.content = content;	}		public Integer getSaleStatus() {		return saleStatus;	}	public void setSaleStatus(Integer saleStatus) {		this.saleStatus = saleStatus;	}		public Integer getStockStatus() {		return stockStatus;	}	public void setStockStatus(Integer stockStatus) {		this.stockStatus = stockStatus;	}		public Date getToProTime() {		return toProTime;	}	public void setToProTime(Date toProTime) {		this.toProTime = toProTime;	}		public Date getOnSaleTime() {		return onSaleTime;	}	public void setOnSaleTime(Date onSaleTime) {		this.onSaleTime = onSaleTime;	}		public Date getUnSaleTime() {		return unSaleTime;	}	public void setUnSaleTime(Date unSaleTime) {		this.unSaleTime = unSaleTime;	}		public Integer getDelStatus() {		return delStatus;	}	public void setDelStatus(Integer delStatus) {		this.delStatus = delStatus;	}		public Date getDelTime() {		return delTime;	}	public void setDelTime(Date delTime) {		this.delTime = delTime;	}		public Integer getProStatus() {		return proStatus;	}	public void setProStatus(Integer proStatus) {		this.proStatus = proStatus;	}		public String getUnproReason() {		return unproReason;	}	public void setUnproReason(String unproReason) {		this.unproReason = unproReason;	}		public Date getProTime() {		return proTime;	}	public void setProTime(Date proTime) {		this.proTime = proTime;	}		public Double getDefaultPrice() {		return defaultPrice;	}	public void setDefaultPrice(Double defaultPrice) {		this.defaultPrice = defaultPrice;	}		public Integer getSaleCount() {		return saleCount;	}	public void setSaleCount(Integer saleCount) {		this.saleCount = saleCount;	}		public Integer getViewCount() {		return viewCount;	}	public void setViewCount(Integer viewCount) {		this.viewCount = viewCount;	}	//override toString Method 	public String toString() {		StringBuffer sb=new StringBuffer();		sb.append("{");		sb.append("'id':'"+this.getId()+"',");		sb.append("'version':'"+this.getVersion()+"',");		sb.append("'goodsId':'"+this.getGoodsId()+"',");		sb.append("'content':'"+this.getContent()+"',");		sb.append("'saleStatus':'"+this.getSaleStatus()+"',");		sb.append("'stockStatus':'"+this.getStockStatus()+"',");		sb.append("'toProTime':'"+this.getToProTime()+"',");		sb.append("'onSaleTime':'"+this.getOnSaleTime()+"',");		sb.append("'unSaleTime':'"+this.getUnSaleTime()+"',");		sb.append("'delStatus':'"+this.getDelStatus()+"',");		sb.append("'delTime':'"+this.getDelTime()+"',");		sb.append("'proStatus':'"+this.getProStatus()+"',");		sb.append("'unproReason':'"+this.getUnproReason()+"',");		sb.append("'proTime':'"+this.getProTime()+"',");		sb.append("'defaultPrice':'"+this.getDefaultPrice()+"',");		sb.append("'saleCount':'"+this.getSaleCount()+"',");		sb.append("'viewCount':'"+this.getViewCount()+"'");		sb.append("}");		return sb.toString();	}}