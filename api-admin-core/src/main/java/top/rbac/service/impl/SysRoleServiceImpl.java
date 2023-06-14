package top.rbac.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.yy.mybatis.service.impl.BaseServiceImpl;
import top.rbac.dao.SysRoleDao;
import top.rbac.entity.SysRoleEntity;
import top.rbac.service.SysRoleService;

/**
 * 系统角色业务实现类
 *
 * @author mqxu
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

}