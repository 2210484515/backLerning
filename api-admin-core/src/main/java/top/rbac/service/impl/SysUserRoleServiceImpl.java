package top.rbac.service.impl;

import org.springframework.stereotype.Service;
import top.yy.mybatis.service.impl.BaseServiceImpl;
import top.rbac.dao.SysUserRoleDao;
import top.rbac.entity.SysUserRoleEntity;
import top.rbac.service.SysUserRoleService;

/**
 * 用户角色关系业务实现类
 *
 * @author mqxu
 */
@Service
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {
}