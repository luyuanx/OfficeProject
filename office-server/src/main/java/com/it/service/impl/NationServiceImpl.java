package com.it.service.impl;

import com.it.mapper.NationMapper;
import com.it.pojo.Nation;
import com.it.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
