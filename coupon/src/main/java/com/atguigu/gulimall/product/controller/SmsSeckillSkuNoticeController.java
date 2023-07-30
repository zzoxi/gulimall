package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.entity.SmsSeckillSkuNoticeEntity;
import com.atguigu.gulimall.product.service.SmsSeckillSkuNoticeService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 秒杀商品通知订阅
 *
 * @author zhouzhou
 * @email zzoxi925@gmail.com
 * @date 2023-07-29 21:02:30
 */
@RestController
@RequestMapping("product/smsseckillskunotice")
public class SmsSeckillSkuNoticeController {
    @Autowired
    private SmsSeckillSkuNoticeService smsSeckillSkuNoticeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSeckillSkuNoticeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsSeckillSkuNoticeEntity smsSeckillSkuNotice = smsSeckillSkuNoticeService.getById(id);

        return R.ok().put("smsSeckillSkuNotice", smsSeckillSkuNotice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsSeckillSkuNoticeEntity smsSeckillSkuNotice){
		smsSeckillSkuNoticeService.save(smsSeckillSkuNotice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsSeckillSkuNoticeEntity smsSeckillSkuNotice){
		smsSeckillSkuNoticeService.updateById(smsSeckillSkuNotice);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsSeckillSkuNoticeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
