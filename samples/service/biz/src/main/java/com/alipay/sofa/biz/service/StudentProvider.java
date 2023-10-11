package com.alipay.sofa.biz.service;

import com.alipay.sofa.model.model.Param;
import com.alipay.sofa.model.model.Provider;
import com.alipay.sofa.model.model.Result;
import com.alipay.sofa.model.model.Student;
import org.springframework.stereotype.Service;

/**
 * @author: yuanyuan
 * @date: 2023/9/25 3:27 下午
 */
@Service
public class StudentProvider implements Provider {

    @Override
    public Result provide(Param param) {
        Result result = new Result();
        result.setSuccess(true);
        result.setPeople(new Student());
        return result;
    }
}
