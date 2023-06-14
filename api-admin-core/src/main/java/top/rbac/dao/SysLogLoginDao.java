package top.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import top.yy.mybatis.dao.BaseDao;
import top.rbac.entity.SysLogLoginEntity;

/**
 * 登录日志 dao
 *
 * @author mqxu
 **/
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}