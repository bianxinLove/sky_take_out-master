package com.sky.service.impl;

import com.sky.entity.Voucher;
import com.sky.mapper.VoucherMapper;
import com.sky.result.Result;
import com.sky.service.VoucherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VoucherServiceImpl implements VoucherService {



    @Override
    public void addSeckillVoucher(Voucher voucher) {

    }

    @Override
    public void save(Voucher voucher) {

    }

    @Override
    public Result queryVoucherOfShop(Long shopId) {
        return null;
    }
}
