package com.kely.exception.handle.demo.example.configuration;

import com.kely.exception.handle.demo.core.message.LogicExceptionMessage;
import com.kely.exception.handle.demo.example.entity.ExceptionInfoEntity;
import com.kely.exception.handle.demo.example.repository.ExceptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 * 业务逻辑异常消息获取实现类
 * - 消息可以从数据库内获取
 * - 消息可从Redis内获取
 */
@Component
public class LogicExceptionMessageSupport implements LogicExceptionMessage {

    /**
     * 异常数据接口
     */
    @Autowired
    private ExceptionRepository exceptionRepository;

    /**
     * 根据错误码获取错误信息
     *
     * @param errCode 错误码
     * @return
     */
    @Override
    public String getMessage(String errCode) {
        ExceptionInfoEntity exceptionInfoEntity = exceptionRepository.findTopByCode(errCode);
        if (!ObjectUtils.isEmpty(exceptionInfoEntity)) {
            return exceptionInfoEntity.getMessage();
        }
        return "系统异常";
    }
}