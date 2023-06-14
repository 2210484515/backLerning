package top.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import top.yy.mybatis.dao.BaseDao;
import top.rbac.entity.SysRoleEntity;

/**
 * 角色管理 dao
 *
 * @author mqxu
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

}