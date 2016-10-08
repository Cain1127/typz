package com.izhbg.typz.base.commondto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="t_xrht_base_attachefile")
public class AttacheFile {
	@Id
	@GenericGenerator(name = "paymentableGenerator", strategy = "assigned") 
	private String id;
	@Column(name="attach_file_name")
	private String attachFileName ;
	@Column(name="conf_id")
	private String confId;
	@Column(name="path")
	private String path;
	@Column(name="attach_show_name")
	private String attachShowName;
	@Column(name="attach_type")
	private String attachType;
	@Column(name="attach_time")
	private Date attachTime;
	@Column(name="attach_size")
	private String attachSize;
	@Column(name="other")
	private String other;
	@Column(name="yh_id")
	private String yhId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAttachFileName() {
		return attachFileName;
	}
	public void setAttachFileName(String attachFileName) {
		this.attachFileName = attachFileName;
	}
	public String getConfId() {
		return confId;
	}
	public void setConfId(String confId) {
		this.confId = confId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getAttachShowName() {
		return attachShowName;
	}
	public void setAttachShowName(String attachShowName) {
		this.attachShowName = attachShowName;
	}
	public String getAttachType() {
		return attachType;
	}
	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}
	public Date getAttachTime() {
		return attachTime;
	}
	public void setAttachTime(Date attachTime) {
		this.attachTime = attachTime;
	}
	public String getAttachSize() {
		return attachSize;
	}
	public void setAttachSize(String attachSize) {
		this.attachSize = attachSize;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getYhId() {
		return yhId;
	}
	public void setYhId(String yhId) {
		this.yhId = yhId;
	}
	
	
}
