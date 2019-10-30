package io.choerodon.devops.infra.mapper;

import io.choerodon.devops.infra.dto.DevopsClusterResourceDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhaotianxin
 * @since 2019/10/29
 */
public interface DevopsClusterResourceMapper extends Mapper<DevopsClusterResourceDTO> {

    DevopsClusterResourceDTO queryByClusterIdAndType(Long clusterId, String type);

    DevopsClusterResourceDTO queryByOptions(@Param("clusterResource") DevopsClusterResourceDTO devopsClusterResourceDTO);

    DevopsClusterResourceDTO queryByClusterIdAndConfigId(Long clusterId,Long configId);
}