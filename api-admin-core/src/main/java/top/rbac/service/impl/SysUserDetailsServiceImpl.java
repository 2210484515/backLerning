package top.rbac.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import top.rbac.convert.SysUserConvert;
import top.rbac.entity.SysUserEntity;
import top.rbac.enums.UserStatusEnum;
import top.rbac.service.SysMenuService;
import top.rbac.service.SysUserDetailsService;
import top.yy.security.user.UserDetail;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户详细信息接口实现类
 *
 * @author mqxu
 */
@Service
@AllArgsConstructor
public class SysUserDetailsServiceImpl implements SysUserDetailsService {
    private final SysMenuService sysMenuService;
    @Override
    public UserDetails getUserDetails(SysUserEntity userEntity) {
        // 转换成UserDetail对象
        UserDetail userDetail = SysUserConvert.INSTANCE.convertDetail(userEntity);

        // 账号不可用
        if (userEntity.getStatus() == UserStatusEnum.DISABLE.getValue()) {
            userDetail.setEnabled(false);
        }

        // 用户权限列表
        Set<String> authoritySet = sysMenuService.getUserAuthority(userDetail);
        userDetail.setAuthoritySet(authoritySet);

        return userDetail;
    }

}
