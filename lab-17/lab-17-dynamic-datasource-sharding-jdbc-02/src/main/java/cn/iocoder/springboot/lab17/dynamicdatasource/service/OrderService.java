package cn.iocoder.springboot.lab17.dynamicdatasource.service;

import cn.iocoder.springboot.lab17.dynamicdatasource.dataobject.OrderDO;
import cn.iocoder.springboot.lab17.dynamicdatasource.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Transactional
    public void add(OrderDO order) {
        // 这里先假模假样的读取一下
        orderMapper.selectById(order.getId());

        // 插入订单
        orderMapper.insert(order);
    }

    public OrderDO findById(Integer id) {
        return orderMapper.selectById(id);
    }

}