package com.izhbg.typz.shop.goods.dto;import java.util.Date;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.Id;import javax.persistence.Table;import org.hibernate.annotations.GenericGenerator;/******************************************************************************* * javaBeans * t_sh_goods_type --> TShGoodsType  * <table explanation> * @author 2016-06-15 10:56:14 *  */	@Entity@Table(name = "t_sh_goods_type")public class TShGoodsType implements java.io.Serializable {	//field	/**  **/	@Id	@GenericGenerator(name = "paymentableGenerator", strategy = "assigned")   	private String id;	/**  **/	private String name;	/**  **/	private String pid;	/**  **/	private Integer sort;	/**  **/	@Column(name = "del_status" )	private Integer delStatus;	/**  **/	@Column(name = "create_time" )	private Date createTime;	/**  **/	@Column(name = "create_user" )	private String createUser;	/**  **/	@Column(name = "update_time" )	private Date updateTime;	/**  **/	@Column(name = "update_user" )	private String updateUser;	//method	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getPid() {		return pid;	}	public void setPid(String pid) {		this.pid = pid;	}	public Integer getSort() {		return sort;	}	public void setSort(Integer sort) {		this.sort = sort;	}		public Integer getDelStatus() {		return delStatus;	}	public void setDelStatus(Integer delStatus) {		this.delStatus = delStatus;	}		public Date getCreateTime() {		return createTime;	}	public void setCreateTime(Date createTime) {		this.createTime = createTime;	}		public String getCreateUser() {		return createUser;	}	public void setCreateUser(String createUser) {		this.createUser = createUser;	}		public Date getUpdateTime() {		return updateTime;	}	public void setUpdateTime(Date updateTime) {		this.updateTime = updateTime;	}		public String getUpdateUser() {		return updateUser;	}	public void setUpdateUser(String updateUser) {		this.updateUser = updateUser;	}	//override toString Method 	public String toString() {		StringBuffer sb=new StringBuffer();		sb.append("{");		sb.append("'id':'"+this.getId()+"',");		sb.append("'name':'"+this.getName()+"',");		sb.append("'pid':'"+this.getPid()+"',");		sb.append("'sort':'"+this.getSort()+"',");		sb.append("'delStatus':'"+this.getDelStatus()+"',");		sb.append("'createTime':'"+this.getCreateTime()+"',");		sb.append("'createUser':'"+this.getCreateUser()+"',");		sb.append("'updateTime':'"+this.getUpdateTime()+"',");		sb.append("'updateUser':'"+this.getUpdateUser()+"'");		sb.append("}");		return sb.toString();	}}