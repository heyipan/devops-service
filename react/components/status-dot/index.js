import React, { memo } from 'react';
import { FormattedMessage } from 'react-intl';
import PropTypes from 'prop-types';
import classnames from 'classnames';
import { Tooltip } from 'choerodon-ui/pro';

import './index.less';

export function getEnvStatus(connect, synchronize, active) {
  if (active) {
    if (!synchronize) {
      return 'operating';
    } else if (connect) {
      return 'running';
    } else {
      return 'disconnect';
    }
  } else {
    return 'stopped';
  }
}

const StatusDot = memo(({ connect, synchronize, active, size }) => {
  /**
   *
   * [connect: true, synchronize: true]   已连接 #0bc2a8
   * [connect: false, synchronize: true]  未连接 #ff9915
   * [synchronize: false]                 处理中 #4d90fe
   * [active: false]                      已停用 #rgba(0,0,0,.26)
   */

  const status = getEnvStatus(connect, synchronize, active);

  const styled = classnames({
    'c7ncd-env-status': true,
    [`c7ncd-env-status-${status}`]: true,
    [`c7ncd-env-status-${size}`]: true,
  });
  const dot = <i className={styled} />;
  return status ? <Tooltip
    placement="top"
    title={<FormattedMessage id={status} />}
  >
    {dot}
  </Tooltip> : dot;
});

StatusDot.propTypes = {
  connect: PropTypes.bool,
  synchronize: PropTypes.bool,
  active: PropTypes.bool,
  size: PropTypes.string,
};

StatusDot.defaultProps = {
  size: 'normal',
  active: true,
};

export default StatusDot;