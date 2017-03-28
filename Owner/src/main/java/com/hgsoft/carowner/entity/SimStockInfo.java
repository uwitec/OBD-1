package com.hgsoft.carowner.entity;

import java.util.Date;

// Generated 2015-8-11 17:55:26 by Hibernate Tools 3.4.0.CR1

/**
 * SimStockInfo generated by hbm2java
 */
public class SimStockInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7168713607243232350L;
	private String stockId;
	private String simId;
	private String obdSn;
	private String activateType;
	private String flowFlag;
	private String regUserId;
	private String name;
	private String activationTime;
	private Long flowUse;
	private Long tempFlowUse;
	private Long cleanFlowUse;
	private Long totalFlow;
	private Integer valid;
	private Date createTime;
	private Date updateTime;
	
	public SimStockInfo() {
	}

	public SimStockInfo(String stockId) {
		this.stockId = stockId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStockId() {
		return this.stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getSimId() {
		return this.simId;
	}

	public void setSimId(String simId) {
		this.simId = simId;
	}

	public String getObdSn() {
		return this.obdSn;
	}

	public void setObdSn(String obdSn) {
		this.obdSn = obdSn;
	}

	public String getActivateType() {
		return this.activateType;
	}

	public void setActivateType(String activateType) {
		this.activateType = activateType;
	}

	public String getFlowFlag() {
		return this.flowFlag;
	}

	public void setFlowFlag(String flowFlag) {
		this.flowFlag = flowFlag;
	}

	public String getRegUserId() {
		return this.regUserId;
	}

	public void setRegUserId(String regUserId) {
		this.regUserId = regUserId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActivationTime() {
		return this.activationTime;
	}

	public void setActivationTime(String activationTime) {
		this.activationTime = activationTime;
	}

	public Long getFlowUse() {
		return flowUse;
	}

	public void setFlowUse(Long flowUse) {
		this.flowUse = flowUse;
	}

	public Long getTempFlowUse() {
		return tempFlowUse;
	}

	public void setTempFlowUse(Long tempFlowUse) {
		this.tempFlowUse = tempFlowUse;
	}

	public Long getTotalFlow() {
		return totalFlow;
	}

	public void setTotalFlow(Long totalFlow) {
		this.totalFlow = totalFlow;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public Long getCleanFlowUse() {
		return cleanFlowUse;
	}

	public void setCleanFlowUse(Long cleanFlowUse) {
		this.cleanFlowUse = cleanFlowUse;
	}

	@Override
	public String toString() {
		return "SimStockInfo [stockId=" + stockId + ", simId=" + simId
				+ ", obdSn=" + obdSn + ", activateType=" + activateType
				+ ", flowFlag=" + flowFlag + ", regUserId=" + regUserId
				+ ", name=" + name + ", activationTime=" + activationTime
				+ ", flowUse=" + flowUse + ", tempFlowUse=" + tempFlowUse
				+ ", cleanFlowUse=" + cleanFlowUse + ", totalFlow=" + totalFlow
				+ ", valid=" + valid + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}


}