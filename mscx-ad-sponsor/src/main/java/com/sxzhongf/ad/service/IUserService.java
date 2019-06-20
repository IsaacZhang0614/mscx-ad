package com.sxzhongf.ad.service;

import com.sxzhongf.ad.common.exception.AdException;
import com.sxzhongf.ad.vo.UserRequestVO;
import com.sxzhongf.ad.vo.UserResponseVO;

/**
 * IUserService for 用户service
 *
 * @author <a href="mailto:magicianisaac@gmail.com">Isaac.Zhang | 若初</a>
 * @since 2019/6/19
 */
public interface IUserService {

    /**
     * 创建用户接口
     *
     * @param userRequestVO {@link UserRequestVO}
     * @return {@link UserResponseVO}
     * @throws AdException 错误
     */
    UserResponseVO createUser(UserRequestVO userRequestVO) throws AdException;
}
