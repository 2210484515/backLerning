package top.rbac.service;

import top.yy.mybatis.service.BaseService;
import top.rbac.entity.SysUserEntity;

/**
 * 系统用户业务接口
 *
 * @author mqxu
 */
public interface SysUserService extends BaseService<SysUserEntity> {

   */
    void updatePassword(Long id, String newPassword);
}