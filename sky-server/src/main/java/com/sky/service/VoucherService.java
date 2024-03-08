package com.sky.service;

import com.sky.entity.Voucher;
import com.sky.result.Result;

public interface VoucherService {

    void addSeckillVoucher(Voucher voucher);

    void save(Voucher voucher);

    Result queryVoucherOfShop(Long shopId);
}
