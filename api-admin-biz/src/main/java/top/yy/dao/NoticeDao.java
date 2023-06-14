package top.yy.dao;

import org.apache.ibatis.annotations.Mapper;
import top.yy.entity.NoticeEntity;
import top.yy.mybatis.dao.BaseDao;

/**
 * NoticeDao
 *
 * @author mqxu
 **/
@Mapper
public interface NoticeDao extends BaseDao<NoticeEntity> {
}