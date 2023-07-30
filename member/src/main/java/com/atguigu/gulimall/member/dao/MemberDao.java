package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhouzhou
 * @email zzoxi925@gmail.com
 * @date 2023-07-30 21:35:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
