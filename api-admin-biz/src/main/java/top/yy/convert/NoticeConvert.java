package top.yy.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.yy.entity.NoticeEntity;
import top.yy.vo.NoticeVO;

import java.util.List;

/**
 * Notice 实体转换
 *
 * @author mqxu
 **/
@Mapper
public interface NoticeConvert {
    NoticeConvert INSTANCE = Mappers.getMapper(NoticeConvert.class);

    NoticeVO convert(NoticeEntity entity);

    NoticeEntity convert(NoticeVO vo);

    List<NoticeVO> convertList(List<NoticeEntity> list);

}