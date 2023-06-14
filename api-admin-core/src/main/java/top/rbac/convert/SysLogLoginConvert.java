package top.rbac.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.rbac.entity.SysLogLoginEntity;
import top.rbac.vo.SysLogLoginVO;

import java.util.List;

/**
 * 登录日志实体转换
 *
 * @author moqi
 */
@Mapper
public interface SysLogLoginConvert {
    SysLogLoginConvert INSTANCE = Mappers.getMapper(SysLogLoginConvert.class);

    SysLogLoginEntity convert(SysLogLoginVO vo);

    SysLogLoginVO convert(SysLogLoginEntity entity);

    List<SysLogLoginVO> converList(List<SysLogLoginEntity> list);

}