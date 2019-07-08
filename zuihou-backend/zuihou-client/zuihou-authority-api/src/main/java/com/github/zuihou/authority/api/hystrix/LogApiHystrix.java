package com.github.zuihou.authority.api.hystrix;

import com.github.zuihou.auth.utils.Token;
import com.github.zuihou.authority.api.LogApi;
import com.github.zuihou.base.R;
import com.github.zuihou.log.entity.OptLogDTO;

import org.springframework.stereotype.Component;

/**
 * This is a Description
 *
 * @author zuihou
 * @date 2019/07/02
 */
@Component
public class LogApiHystrix implements LogApi {
    @Override
    public R<Token> save(OptLogDTO log) {
        return R.timeout();
    }
}