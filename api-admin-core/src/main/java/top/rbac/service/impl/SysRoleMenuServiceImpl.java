package top.rbac.service.impl;


import org.springframework.stereotype.Service;
import top.yy.mybatis.service.impl.BaseServiceImpl;
import top.rbac.dao.SysRoleMenuDao;
import top.rbac.entity.SysRoleMenuEntity;
import top.rbac.service.SysRoleMenuService;


/**
 * 角色与菜单对应业务实现类
 *
 * @author mqxu
 */
@Service
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}