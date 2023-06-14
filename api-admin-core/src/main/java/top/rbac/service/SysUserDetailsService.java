package top.rbac.service;

import org.springframework.security.core.userdetails.UserDetails;
import top.rbac.entity.SysUserEntity;

/**
 * 用户详细信息接口
 * @author moqi
 */
public interface SysUserDetailsService {
    UserDetails getUserDetails(SysUserEntity userEntity);
}
