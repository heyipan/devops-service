package io.choerodon.devops.infra.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.choerodon.devops.api.vo.DevopsEnvWithPolarisResultVO;
import io.choerodon.devops.api.vo.InstanceWithPolarisResultVO;
import io.choerodon.devops.infra.dto.DevopsPolarisInstanceResultDTO;
import io.choerodon.mybatis.common.Mapper;

/**
 * @author zmf
 * @since 2/17/20
 */
public interface DevopsPolarisInstanceResultMapper extends Mapper<DevopsPolarisInstanceResultDTO> {
    void batchInsert(@Param("items") List<DevopsPolarisInstanceResultDTO> items);

    /**
     * 查询带有扫描结果的实例数据
     *
     * @param recordId 扫描纪录id
     * @param envId    环境id
     * @return 数据
     */
    List<InstanceWithPolarisResultVO> queryInstanceWithResult(
            @Param("recordId") Long recordId,
            @Param("envId") Long envId);

    /**
     * 查询没有扫描结果的环境数据
     *
     * @param clusterId 集群id
     * @return 数据
     */
    List<DevopsEnvWithPolarisResultVO> queryEnvWithoutPolarisResult(@Param("clusterId") Long clusterId);

    /**
     * 查询带有扫描结果的环境数据
     *
     * @param recordId 扫描纪录id
     * @return 数据
     */
    List<DevopsEnvWithPolarisResultVO> queryEnvWithPolarisResult(@Param("recordId") Long recordId);
}
