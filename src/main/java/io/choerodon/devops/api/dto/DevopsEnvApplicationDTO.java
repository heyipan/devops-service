package io.choerodon.devops.api.dto;

/**
 * @author lizongwei
 * @date 2019/7/1
 */
public class DevopsEnvApplicationDTO {

    private Long appId;
    private Long envId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }
}