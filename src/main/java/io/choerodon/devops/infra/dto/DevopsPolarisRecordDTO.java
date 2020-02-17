package io.choerodon.devops.infra.dto;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

import io.choerodon.mybatis.entity.BaseDTO;

/**
 * polaris扫描纪录
 *
 * @author zmf
 * @since 2/17/20
 */
@Table(name = "devops_polaris_record")
public class DevopsPolarisRecordDTO extends BaseDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("自增id")
    private Long id;

    @ApiModelProperty("纪录对象id(集群id或环境id)")
    private Long scopeId;

    @ApiModelProperty("纪录对象类型(cluster/env)")
    private String scope;

    @ApiModelProperty("操作状态")
    private String status;

    @ApiModelProperty("这次扫描开始时间")
    private Date scanDateTime;

    @ApiModelProperty("上次扫描结束时间")
    private Date lastScanDateTime;

    @ApiModelProperty("通过的检测项数量")
    private Long successes;

    @ApiModelProperty("警告的检测项数量")
    private Long warnings;

    @ApiModelProperty("错误的检测项数量")
    private Long errors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScopeId() {
        return scopeId;
    }

    public void setScopeId(Long scopeId) {
        this.scopeId = scopeId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getScanDateTime() {
        return scanDateTime;
    }

    public void setScanDateTime(Date scanDateTime) {
        this.scanDateTime = scanDateTime;
    }

    public Date getLastScanDateTime() {
        return lastScanDateTime;
    }

    public void setLastScanDateTime(Date lastScanDateTime) {
        this.lastScanDateTime = lastScanDateTime;
    }

    public Long getSuccesses() {
        return successes;
    }

    public void setSuccesses(Long successes) {
        this.successes = successes;
    }

    public Long getWarnings() {
        return warnings;
    }

    public void setWarnings(Long warnings) {
        this.warnings = warnings;
    }

    public Long getErrors() {
        return errors;
    }

    public void setErrors(Long errors) {
        this.errors = errors;
    }
}