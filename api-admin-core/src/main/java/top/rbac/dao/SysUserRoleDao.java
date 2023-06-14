package top.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import top.yy.mybatis.dao.BaseDao;
import top.rbac.entity.SysUserRoleEntity;


/**
 * 用户角色关系 dao
 *
 * @author mqxu
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

}